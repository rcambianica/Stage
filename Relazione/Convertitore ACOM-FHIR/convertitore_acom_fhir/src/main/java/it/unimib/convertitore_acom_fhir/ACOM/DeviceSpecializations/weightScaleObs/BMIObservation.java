package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BMIObservation extends NumericObservation {

    public BMIObservation(String derivedFrom[], float value) {
        super(value, UnitCode.MDC_DIM_KILO_G_PER_M_SQ, ObservationsType.MDC_RATIO_MASS_BODY_LEN_SQ);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
        setDerivedFrom(derivedFrom);
    }
}
