package it.unimib.convertitore_acom_fhir.FHIR;

public class Text {

    private final String status = "generated";
    private String div;

    public Text(String div) {
        this.div = div;
    }

    public String getStatus() {
        return status;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    
}
