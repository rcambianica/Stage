package it.unimib.convertitore_acom_fhir;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;

public class Observation {

    private final int patientId = 1234;
    private ObservationsType type;
    private Date timestamp;
    private SupplementalInfo supplementalInfo [];

    public int getPatientId() {
        return patientId;
    }

    public ObservationsType getType() {
        return type;
    }

    public void setType(ObservationsType type) {
        this.type = type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public SupplementalInfo[] getSupplementalInfo() {
        return supplementalInfo;
    }

    public void setSupplementalInfo(SupplementalInfo supplementalInfo []) {
        this.supplementalInfo = supplementalInfo;
    }
}