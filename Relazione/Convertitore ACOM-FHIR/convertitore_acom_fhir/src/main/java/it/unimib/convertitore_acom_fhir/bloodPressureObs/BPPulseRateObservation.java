package it.unimib.convertitore_acom_fhir.bloodPressureObs;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BPPulseRateObservation extends NumericObservation {

    public BPPulseRateObservation(float value, float accuracy) {
        super(value, UnitCode.MDC_DIM_BEAT_PER_MIN, ObservationsType.MDC_PULS_RATE_NON_INV);
        setTimestamp(new Date());
    }
}
