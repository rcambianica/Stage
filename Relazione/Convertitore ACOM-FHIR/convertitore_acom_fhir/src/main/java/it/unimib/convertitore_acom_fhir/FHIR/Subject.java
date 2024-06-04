package it.unimib.convertitore_acom_fhir.FHIR;

public class Subject {
    private String reference;
    public Subject(String reference)    {
        this.reference = reference;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

}
