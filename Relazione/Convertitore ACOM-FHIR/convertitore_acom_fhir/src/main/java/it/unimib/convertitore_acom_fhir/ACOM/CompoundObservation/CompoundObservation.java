package it.unimib.convertitore_acom_fhir.ACOM.CompoundObservation;

import it.unimib.convertitore_acom_fhir.ACOM.ACOMObservation;

public class CompoundObservation extends ACOMObservation {

    private ObservationComponent components[];

    public ObservationComponent[] getComponents() {
        return components;
    }

    public void setComponents(ObservationComponent[] components) {
        this.components = components;
    }

    @Override
    public String converter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'converter'");
    }

}
