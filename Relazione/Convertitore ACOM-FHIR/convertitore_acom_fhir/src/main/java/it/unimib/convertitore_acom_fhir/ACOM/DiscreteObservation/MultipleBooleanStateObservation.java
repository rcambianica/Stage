package it.unimib.convertitore_acom_fhir.ACOM.DiscreteObservation;

public class MultipleBooleanStateObservation extends DiscreteObservation {
    private Boolean[] state;

    public Boolean[] getState() {
        return state;
    }

    public void setState(Boolean[] state) {
        this.state = state;
    }

}
