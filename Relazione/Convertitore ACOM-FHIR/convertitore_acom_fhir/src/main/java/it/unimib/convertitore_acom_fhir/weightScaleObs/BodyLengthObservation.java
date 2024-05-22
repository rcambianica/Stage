package it.unimib.convertitore_acom_fhir.weightScaleObs;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyLengthObservation extends NumericObservation {

    public BodyLengthObservation(float value, UnitCode unitCode) {
        super(value, unitCode, ObservationsType.MDC_RATIO_MASS_BODY_ACTUAL);
        setTimestamp(new Date());
    }

}
