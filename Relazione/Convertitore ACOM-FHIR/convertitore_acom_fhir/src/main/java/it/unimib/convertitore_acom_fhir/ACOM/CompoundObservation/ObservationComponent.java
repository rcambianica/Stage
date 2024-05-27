package it.unimib.convertitore_acom_fhir.ACOM.CompoundObservation;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public abstract class ObservationComponent {
    private ObservationsType componentType;

    public ObservationsType getComponentType() {
        return componentType;
    }

    public void setComponentType(ObservationsType componentType) {
        this.componentType = componentType;
    }

}
