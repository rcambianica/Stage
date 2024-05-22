package it.unimib.convertitore_acom_fhir.temperatureObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

import java.util.Date;

public class TemperatureObservation extends NumericObservation {

    public TemperatureObservation() {
        super(36.5f, UnitCode.MDC_DIM_DEGC,ObservationsType.MDC_TEMP_BODY);
        setTimestamp(new Date());
    }

    public TemperatureObservation(float value, ObservationsType type, UnitCode unit) {
        super(value, unit,type);
        setTimestamp(new Date());
    }

}
