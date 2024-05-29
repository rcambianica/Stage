package it.unimib.convertitore_acom_fhir.FHIR;

public class Identifier {

    private String system = "urn:ietf:rfc:3986";
    private String value;

    public Identifier(String value) {
        this.value = value;
    }

    public String getSystem() {
        return system;
    }
    public void setSystem(String system) {
        this.system = system;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
}
