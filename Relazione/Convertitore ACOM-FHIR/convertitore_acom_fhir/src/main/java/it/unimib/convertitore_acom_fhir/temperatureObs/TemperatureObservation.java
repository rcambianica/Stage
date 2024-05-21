package it.unimib.convertitore_acom_fhir.temperatureObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

import java.util.Date;

public class TemperatureObservation extends NumericObservation {

    protected ObservationsType temperatureType;

    public TemperatureObservation() {
        this.observationType = ObservationsType.TEMPERATURE;
        this.timestamp = new Date();
        this.temperatureType = ObservationsType.MDC_TEMP_BODY;
        this.value = 36.5f;
        this.unit = UnitCode.MDC_DIM_DEGC;
        this.accuracy = 0.1f;
    }

    public TemperatureObservation(float value, ObservationsType temperatureType, UnitCode unit, float accuracy) {
        this.observationType = ObservationsType.TEMPERATURE;
        this.timestamp = new Date();
        this.temperatureType = temperatureType;
        this.value = value;
        this.unit = unit;
        this.accuracy = accuracy;
    }
}
