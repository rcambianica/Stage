package it.unimib.convertitore_acom_fhir;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public abstract class Observation {

    private final int patientId = 1234;
    protected ObservationsType observationType;
    protected Date timestamp;

    
    

    public int getPatientId() {
        return patientId;
    }

    
    public ObservationsType getObservationType() {
        return observationType;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}