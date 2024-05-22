package it.unimib.convertitore_acom_fhir;

public class CompoundObservation extends Observation {

    private Observation observationComponents[];

    public Observation[] getComponents() {
        return observationComponents;
    }

    public void setComponents(Observation[] observastionComponents) {
        this.observationComponents = observastionComponents;
    }

}
