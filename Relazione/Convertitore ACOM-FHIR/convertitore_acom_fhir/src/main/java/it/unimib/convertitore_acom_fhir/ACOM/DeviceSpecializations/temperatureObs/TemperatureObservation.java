package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.temperatureObs;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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

}
