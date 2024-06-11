package it.unimib.convertitore_acom_fhir.FHIR;

public class Person {
    private String reference;
    public Person(String reference)    {
        this.reference = reference;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

}
