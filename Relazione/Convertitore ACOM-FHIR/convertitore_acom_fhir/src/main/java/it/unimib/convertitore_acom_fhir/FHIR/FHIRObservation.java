package it.unimib.convertitore_acom_fhir.FHIR;

import it.unimib.convertitore_acom_fhir.Util.ObservationStatusCode;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;

public class FHIRObservation {

    private String id;
    private ObservationsType code;
    private String effectiveDateTime;
    // Se lo stato di misurazione indica che la misurazione non è valida, non
    // disponibile, o che la misurazione è in corso poi il associato campo
    // measurement.value è sostituito da questo campo
    private ObservationStatusCode dataAbsentReason;
    // If the measurement-status indicates that the measurement is questionable,
    // calibrating, early indication, threshold error or annunciation inhibited,
    // then this field provides context to the measurement value
    private ObservationStatusCode interpretation;
    private String derivedFrom[];
    private String hasMember[];
    private SupplementalInfo component[];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObservationsType getCode() {
        return code;
    }

    public void setCode(ObservationsType code) {
        this.code = code;
    }

    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    public void setEffectiveDateTime(String effectiveDateTime) {
        this.effectiveDateTime = effectiveDateTime;
    }

    public ObservationStatusCode getDataAbsentReason() {
        return dataAbsentReason;
    }

    public void setDataAbsentReason(ObservationStatusCode dataAbsentReason) {
        this.dataAbsentReason = dataAbsentReason;
    }

    public ObservationStatusCode getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(ObservationStatusCode interpretation) {
        this.interpretation = interpretation;
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

    public SupplementalInfo[] getComponent() {
        return component;
    }

    public void setComponent(SupplementalInfo[] component) {
        this.component = component;
    }
}
