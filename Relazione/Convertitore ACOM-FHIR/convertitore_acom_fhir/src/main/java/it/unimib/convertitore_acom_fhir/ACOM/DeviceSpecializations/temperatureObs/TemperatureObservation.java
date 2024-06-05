package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.temperatureObs;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.FHIR.CodeableConcept;
import it.unimib.convertitore_acom_fhir.FHIR.Coding;
import it.unimib.convertitore_acom_fhir.FHIR.FHIRObservation;
import it.unimib.convertitore_acom_fhir.FHIR.Quantity;
import it.unimib.convertitore_acom_fhir.Util.Costants;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TemperatureObservation extends NumericObservation {

    public TemperatureObservation() {
        super(36.5f, UnitCode.MDC_DIM_DEGC, ObservationsType.MDC_TEMP_BODY);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }

    public TemperatureObservation(float value, ObservationsType type, UnitCode unit) {
        super(value, unit, type);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }

    // genera osservazioni come da esempio
    // https://hl7.org/fhir/observation-example-body-temperature.json.html
    @Override
    public String converter() {
        FHIRObservation fhirObservation = new FHIRObservation();
        // parametri che non dipendono da valori presenti nell'osservazione ACOM, ma che
        // possiamo settare in base al tipo di osservazione
        fhirObservation.setId("body-temperature");
        fhirObservation.setMeta("http://hl7.org/fhir/StructureDefinition/vitalsigns");
        fhirObservation.getText().setDiv(
                "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative: Observation</b><a name=\"body-temperature\">");
        Coding[] coding = new Coding[2];

        // category
        coding[0] = new Coding("http://terminology.hl7.org/CodeSystem/observation-category",
                Costants.CODE_VITAL_SIGNS, Costants.DISPLAY_VITAL_SIGNS);
        CodeableConcept category = new CodeableConcept(coding[0]);
        category.setText(Costants.DISPLAY_VITAL_SIGNS);
        fhirObservation.setCategory(category);
        coding[1] = new Coding("http://loinc.org", "8310-5", "Body temperature");

        // code
        CodeableConcept code = new CodeableConcept(coding[1]);
        code.setText("Body temperature");
        fhirObservation.setCode(code);

        // effectiveDateTime
        fhirObservation.setEffectiveDateTime(this.getTimestamp());

        // value
        Quantity valueQuantity = new Quantity(this.getValue(), "http://unitsofmeasure.org");
        switch (this.getUnit()) {
            case MDC_DIM_DEGC: {
                valueQuantity.setUnit("C");
                valueQuantity.setCode(Costants.CODE_TEMP_CEL);
                break;
            }

            case MDC_DIM_FAHR:
                valueQuantity.setUnit("F");
                valueQuantity.setCode(Costants.CODE_TEMP_FAHR);
                break;

            case MDC_DIM_KELVIN:
                valueQuantity.setUnit("K");
                valueQuantity.setCode(Costants.CODE_TEMP_KEL);
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
