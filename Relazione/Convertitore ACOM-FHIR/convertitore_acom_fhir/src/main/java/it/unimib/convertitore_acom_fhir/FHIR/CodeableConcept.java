package it.unimib.convertitore_acom_fhir.FHIR;

public class CodeableConcept {

    private Coding coding;
    private final String text = "Test for example";

    public CodeableConcept(Coding coding) {
        this.coding = coding;
    }

    public Coding getCoding() {
        return coding;
    }

    public void setCoding(Coding coding) {
        this.coding = coding;
    }

    public String getText() {
        return text;
    }

}
