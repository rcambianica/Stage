package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.bloodPressureObs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BPPulseRateObservation extends NumericObservation {

    public BPPulseRateObservation(float value) {
        super(value, UnitCode.MDC_DIM_BEAT_PER_MIN, ObservationsType.MDC_PULS_RATE_NON_INV);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }
}
