package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyLengthObservation extends NumericObservation {

    public BodyLengthObservation(float value, UnitCode unitCode) {
        super(value, unitCode, ObservationsType.MDC_RATIO_MASS_BODY_ACTUAL);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
    }

}
