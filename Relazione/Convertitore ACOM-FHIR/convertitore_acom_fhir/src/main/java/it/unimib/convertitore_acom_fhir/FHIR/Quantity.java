package it.unimib.convertitore_acom_fhir.FHIR;

public class Quantity extends Value{

    private float value;
    // < | <= | >= | > | ad - how to understand the value
    private char comparator;
    private String unit;
    // System that defines coded unit form
    private String system;
    // Coded form of the unit
    private String code;

    public Quantity (float value, String system)  {
        this.value = value;
        this.system = system;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public char getComparator() {
        return comparator;
    }

    public void setComparator(char comparator) {
        this.comparator = comparator;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system)  {
        this.system = system;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
