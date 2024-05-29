package it.unimib.convertitore_acom_fhir.FHIR;

import it.unimib.convertitore_acom_fhir.Util.ObservationStatusCode;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;

public class FHIRObservation {

    private final String resourceType = "Observation";
    private ObservationsType id;
    private final String[] meta = {"http://hl7.org/fhir/StructureDefinition/vitalsigns"};
    private Text text;
    private Identifier identifier;
    private final String status = "final";
    private CodeableConcept category;
    private CodeableConcept code;

    private String effectiveDateTime;
    // Se lo stato di misurazione indica che la misurazione non è valida, non
    // disponibile, o che la misurazione è in corso poi il associato campo
    // measurement.value è sostituito da questo campo. dataAbsentReason DEVE essere
    // presente solo se Observation.value[x] non è presente
    private ObservationStatusCode dataAbsentReason;
    // If the measurement-status indicates that the measurement is questionable,
    // calibrating, early indication, threshold error or annunciation inhibited,
    // then this field provides context to the measurement value
    private ObservationStatusCode interpretation;
    private String derivedFrom[];
    private String hasMember[];
    private SupplementalInfo component[];

    public String getResourceType() {
        return resourceType;
    }

    public ObservationsType getId() {
        return id;
    }

    public void setId(ObservationsType id) {
        this.id = id;
    }

    public String[] getMeta() {
        return meta;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public String getStatus() {
        return status;
    }

    public CodeableConcept getCategory() {
        return category;
    }

    public void setCategory(CodeableConcept category) {
        this.category = category;
    }

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept code) {
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
