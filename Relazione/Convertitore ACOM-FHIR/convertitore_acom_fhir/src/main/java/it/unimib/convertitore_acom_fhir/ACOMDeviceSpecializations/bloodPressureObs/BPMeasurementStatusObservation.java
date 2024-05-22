package it.unimib.convertitore_acom_fhir.ACOMDeviceSpecializations.bloodPressureObs;

import java.util.Date;
import java.util.UUID;

import it.unimib.convertitore_acom_fhir.DiscreteObservation.MultipleBooleanStateObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public class BPMeasurementStatusObservation extends MultipleBooleanStateObservation {
    public BPMeasurementStatusObservation() {
        setId(UUID.randomUUID().toString());
        setTimestamp(new Date());
        setType(ObservationsType.MDC_BLOOD_PRESSURE_MEASUREMENT_STATUS);
        setState(new Boolean[6]);
    }
}
