package it.unimib.convertitore_acom_fhir.ACOM.CompoundObservation;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class NumericComponent extends ObservationComponent {
    private UnitCode unit;
    private float value;

    public NumericComponent(ObservationsType componentType, float value, UnitCode unit) {
        setComponentType(componentType);
        this.value = value;
        this.unit = unit;
    }

    public UnitCode getUnit() {
        return unit;
    }

    public void setUnit(UnitCode unit) {
        this.unit = unit;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
