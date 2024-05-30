package it.unimib.convertitore_acom_fhir;

import java.util.ArrayList;

import it.unimib.convertitore_acom_fhir.ACOM.ACOMObservation;
import it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.temperatureObs.TemperatureObservation;
import it.unimib.convertitore_acom_fhir.FHIR.CodeableConcept;
import it.unimib.convertitore_acom_fhir.FHIR.Coding;
import it.unimib.convertitore_acom_fhir.FHIR.FHIRObservation;
import it.unimib.convertitore_acom_fhir.FHIR.Text;
import it.unimib.convertitore_acom_fhir.Util.*;

public class ConverterToFHIR {

    private ACOMObservation ACOMObservation;
    private FHIRObservation FHIRObservation = new FHIRObservation();

    // IEEE 11073-10408 THERMOMETER
    public FHIRObservation Converter(TemperatureObservation ACOMObservation) {
        this.ACOMObservation = ACOMObservation;
        this.FHIRObservation.setId(Costants.CODE_TEMPERATURE);
        this.FHIRObservation.setText(new Text("<div xmlns=\\\"http://www.w3.org/1999/xhtml\\\"><p><b>Generated Narrative: Observation</b><a name="
        + this.FHIRObservation.getId() + "> </a></p><div>"));
        this.FHIRObservation.getCategory().add(new CodeableConcept(new Coding(Costants.SYSTEM_HL7_OBS_CAT,Costants.CODE_VITAL_SIGNS,Costants.DISPLAY_VITAL_SIGNS)));

        return FHIRObservation;
    }

    public ACOMObservation getACOMObservation() {
        return ACOMObservation;
    }

    public void setACOMObservation(ACOMObservation aCOMObservation) {
        ACOMObservation = aCOMObservation;
    }
}
