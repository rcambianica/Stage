package it.unimib.convertitore_acom_fhir.FHIR;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public class CodeableConcept {
    
    private Coding coding;
    private final String text = "Test for example";

    public CodeableConcept(ObservationsType code)   {
        this.coding.setCode(code);
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
