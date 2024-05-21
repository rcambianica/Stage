package it.unimib.convertitore_acom_fhir.weightScaleObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyLengthObservation extends NumericObservation {

    public BodyLengthObservation(float value, UnitCode unitCode) {
        this.observationType = ObservationsType.MDC_RATIO_MASS_BODY_ACTUAL;
        this.value = value;
        this.unit = unitCode;
    }

}
