package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.FHIR.CodeableConcept;
import it.unimib.convertitore_acom_fhir.FHIR.Coding;
import it.unimib.convertitore_acom_fhir.FHIR.FHIRObservation;
import it.unimib.convertitore_acom_fhir.FHIR.Quantity;
import it.unimib.convertitore_acom_fhir.Util.Costants;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyMassObservation extends NumericObservation {

    public BodyMassObservation(float value, UnitCode unitCode) {
        super(value, unitCode, ObservationsType.MDC_MASS_BODY_ACTUAL);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }

    @Override
    public String converter() {
        FHIRObservation fhirObservation = new FHIRObservation();
                // parametri che non dipendono da valori presenti nell'osservazione ACOM, ma che
        // possiamo settare in base al tipo di osservazione
        fhirObservation.setId("body-weight");
        fhirObservation.setMeta("http://hl7.org/fhir/StructureDefinition/vitalsigns");
        fhirObservation.getText().setDiv(
                "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative: Observation</b><a name=\"body-weight\">");
        
              

        // category
        CodeableConcept category = new CodeableConcept(new Coding("http://terminology.hl7.org/CodeSystem/observation-category",
        Costants.CODE_VITAL_SIGNS, Costants.DISPLAY_VITAL_SIGNS));
        category.setText(Costants.DISPLAY_VITAL_SIGNS);
        fhirObservation.setCategory(category);

        // code
        
        ArrayList<Coding> coding = new ArrayList<>();
        coding.add(new Coding("http://loinc.org", "29463-7", "Body Weight"));
        coding.add(new Coding("http://loinc.org","3141-9", "Body weight Measured"));
        coding.add(new Coding("http://snomed.info/sct","27113001","Body weight"));
        coding.add(new Coding("http://acme.org/devices/clinical-codes","body-weight","Body Weight"));
        CodeableConcept code = new CodeableConcept(coding);
        fhirObservation.setCode(code);
        // effectiveDateTime
        fhirObservation.setEffectiveDateTime(this.getTimestamp());

        // value
        Quantity valueQuantity = new Quantity(this.getValue(), "http://unitsofmeasure.org");
        switch (this.getUnit()) {
            case MDC_DIM_KILO_G: {
                valueQuantity.setUnit("kg");
                valueQuantity.setCode(Costants.CODE_WEIGHT_KILO_G);
                break;
            }

            case MDC_DIM_LB:
                valueQuantity.setUnit("lbs");
                valueQuantity.setCode(Costants.CODE_WEIGHT_LBS);
                break;

            default:
                break;
        }
        fhirObservation.setValue(valueQuantity);
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String json = gson.toJson(fhirObservation);
        return json;
    }

}
