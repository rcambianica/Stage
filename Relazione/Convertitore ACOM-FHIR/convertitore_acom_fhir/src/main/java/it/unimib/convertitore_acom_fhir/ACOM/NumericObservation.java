package it.unimib.convertitore_acom_fhir.ACOM;

import java.util.UUID;

import it.unimib.convertitore_acom_fhir.Util.*;

public class NumericObservation extends ACOMObservation {
   
    private float accuracy;
    private float value;
    private UnitCode unit;

    public float getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public UnitCode getUnit() {
        return unit;
    }
    public void setUnit(UnitCode unit) {
        this.unit = unit;
    }
    public NumericObservation (float value, UnitCode unit, ObservationsType type)  {
        setId(UUID.randomUUID().toString());
        this.value = value;
        this.unit = unit;
        setType(type);
        this.accuracy = 0.1f;
    }
    @Override
    public String converter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'converter'");
    }
   
}
