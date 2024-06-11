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

public class BodyLengthObservation extends NumericObservation {

    public BodyLengthObservation(float value, UnitCode unitCode) {
        super(value, unitCode, ObservationsType.MDC_RATIO_MASS_BODY_ACTUAL);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }

    @Override
    public String converter() {
        FHIRObservation fhirObservation = new FHIRObservation();
                // parametri che non dipendono da valori presenti nell'osservazione ACOM, ma che
        // possiamo settare in base al tipo di osservazione
        fhirObservation.setId("body-length");
        fhirObservation.setMeta("http://hl7.org/fhir/StructureDefinition/vitalsigns");
        fhirObservation.getText().setDiv(
                "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative: Observation</b><a name=\"body-length\">");
        
              

        // category
        CodeableConcept category = new CodeableConcept(new Coding("http://terminology.hl7.org/CodeSystem/observation-category",
        Costants.CODE_VITAL_SIGNS, Costants.DISPLAY_VITAL_SIGNS));
        category.setText(Costants.DISPLAY_VITAL_SIGNS);
        fhirObservation.setCategory(category);

        // code
        
        ArrayList<Coding> coding = new ArrayList<>();
        coding.add(new Coding("http://loinc.org", "8302-2", "Body height"));
        coding.add(new Coding("http://loinc.org","8306-3", "Body height --lying"));
       
        CodeableConcept code = new CodeableConcept(coding);
        fhirObservation.setCode(code);
        fhirObservation.getCode().setText("Body Length");
        // effectiveDateTime
        fhirObservation.setEffectiveDateTime(this.getTimestamp());

        // value
        Quantity valueQuantity = new Quantity(this.getValue(), "http://unitsofmeasure.org");
        switch (this.getUnit()) {
            case MDC_DIM_CENTI_M: {
                valueQuantity.setUnit("cm");
                valueQuantity.setCode(Costants.CODE_WEIGHT_CENTI_M);
                break;
            }

            case MDC_DIM_INCH:
                valueQuantity.setUnit("inch");
                valueQuantity.setCode(Costants.CODE_WEIGHT_INCH);
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
