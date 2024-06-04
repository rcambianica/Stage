package it.unimib.convertitore_acom_fhir.FHIR;

import java.util.ArrayList;

public class CodeableConcept {

    private ArrayList<Coding> coding;
    private String text;

    public CodeableConcept(ArrayList<Coding> coding) {
        this.coding = coding;
    }

    public CodeableConcept(Coding coding) {
        this.coding = new ArrayList<Coding>();
        this.coding.add(coding);
    }

    public ArrayList<Coding> getCoding() {
        return coding;
    }

    public void setCoding(ArrayList<Coding> coding) {
        this.coding = coding;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
