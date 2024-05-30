package it.unimib.convertitore_acom_fhir.FHIR;

public class Coding {

    private String system;
    private String version;
    private String code;
    private String display;
    private boolean userSelected;

    public Coding(String code) {
        this.code = code;
    }

    public Coding(String code, String display) {
        this.code = code;
        this.display = display;
    }

    public Coding(String system, String code, String display) {
        this.system = system;
        this.code = code;
        this.display = display;
    }
    
    public void setSystem(String system) {
        this.system = system;
    }

    public String getSystem() {
        return system;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean isUserSelected() {
        return userSelected;
    }

    public void setUserSelected(boolean userSelected) {
        this.userSelected = userSelected;
    }

}
