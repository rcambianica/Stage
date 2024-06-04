package it.unimib.convertitore_acom_fhir.ACOM;

import it.unimib.convertitore_acom_fhir.ConverterToFHIR;

//import java.time.Duration;

import it.unimib.convertitore_acom_fhir.Util.ObservationStatusCode;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;

public abstract class ACOMObservation implements ConverterToFHIR   {

    private String id;
    private String derivedFrom[];
    private String hasMember[];
    // private Duration measurementDuration;
    private ObservationStatusCode measurementStatus;
    private final int patientId = 1234;
    private SupplementalInfo supplementalInfo[];
    private String timestamp;
    private ObservationsType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getDerivedFrom() {
        return derivedFrom;
    }

    public void setDerivedFrom(String[] derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public String[] getHasMember() {
        return hasMember;
    }

    public void setHasMember(String[] hasMember) {
        this.hasMember = hasMember;
    }

    /*
     * public Duration getMeasurementDuration() {
     * return measurementDuration;
     * }
     * 
     * public void setMeasurementDuration(Duration measurementDuration) {
     * this.measurementDuration = measurementDuration;
     * }
     */
    public ObservationStatusCode getMeasurementStatus() {
        return measurementStatus;
    }

    public void setMeasurementStatus(ObservationStatusCode measurementStatus) {
        this.measurementStatus = measurementStatus;
    }

    public int getPatientId() {
        return patientId;
    }

    public SupplementalInfo[] getSupplementalInfo() {
        return supplementalInfo;
    }

    public void setSupplementalInfo(SupplementalInfo[] supplementalInfo) {
        this.supplementalInfo = supplementalInfo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ObservationsType getType() {
        return type;
    }

    public void setType(ObservationsType type) {
        this.type = type;
    }
}