package it.unimib.convertitore_acom_fhir.FHIR;

public class Quantity {

    private int value;
    // < | <= | >= | > | ad - how to understand the value
    private char comparator;
    private String unit;
    // System that defines coded unit form
    private final String system = "";
    // Coded form of the unit
    private String code;

    public Quantity (int value)  {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
