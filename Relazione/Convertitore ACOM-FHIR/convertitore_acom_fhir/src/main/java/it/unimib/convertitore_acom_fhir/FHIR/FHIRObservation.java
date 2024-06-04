package it.unimib.convertitore_acom_fhir.FHIR;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import it.unimib.convertitore_acom_fhir.Util.ObservationStatusCode;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;

public class FHIRObservation {

    private String resourceType;
    private String id;
    private Meta meta;
    private Text text;
    private Identifier identifier;
    private String status;
    private ArrayList<CodeableConcept> category;
    private CodeableConcept code;
    private Subject subject;
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
    @SerializedName ("valueQuantity")
    private Value value;

    public String getResourceType() {
        return resourceType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Meta getMeta() {
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

    public ArrayList<CodeableConcept> getCategory() {
        return category;
    }

    public void setCategory(CodeableConcept category) {
        this.category = new ArrayList<>();
        this.category.add(category);
    }

    public void setCategory(ArrayList<CodeableConcept> category) {
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

    public Value getValue() {
        return value;
    }

    public void setValue(Quantity valueQuantity)    {
        this.value = valueQuantity;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setMeta(String profile) {
        this.meta.setProfile(profile);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public FHIRObservation() {
        this.resourceType = "Observation";
        this.meta = new Meta(null);
        this.text = new Text(null);
        this.status = "final";
        this.subject = new Subject("Patient/example");
    }
}
