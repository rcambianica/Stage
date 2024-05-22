package it.unimib.convertitore_acom_fhir.ACOMDeviceSpecializations.weightScaleObs;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyMassObservation extends NumericObservation {

    public BodyMassObservation(int id, float value, UnitCode unitCode) {
        super(value, unitCode, ObservationsType.MDC_MASS_BODY_ACTUAL);
        setTimestamp(new Date());
    }
}
