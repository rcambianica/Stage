package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.bloodPressureObs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import it.unimib.convertitore_acom_fhir.ACOM.DiscreteObservation.MultipleBooleanStateObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public class BPMeasurementStatusObservation extends MultipleBooleanStateObservation {
    public BPMeasurementStatusObservation() {
        setId(UUID.randomUUID().toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setTimestamp(sdf.format(new Date()));
        setType(ObservationsType.MDC_BLOOD_PRESSURE_MEASUREMENT_STATUS);
        setState(new Boolean[6]);
    }
}
