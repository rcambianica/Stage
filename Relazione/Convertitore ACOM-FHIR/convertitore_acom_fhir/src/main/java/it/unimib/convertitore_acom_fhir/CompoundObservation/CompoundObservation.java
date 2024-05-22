package it.unimib.convertitore_acom_fhir.CompoundObservation;

import it.unimib.convertitore_acom_fhir.Observation;

public class CompoundObservation extends Observation {

    private ObservationComponent components[];

    public ObservationComponent[] getComponents() {
        return components;
    }

    public void setComponents(ObservationComponent[] components) {
        this.components = components;
    }

}
