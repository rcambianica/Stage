package it.unimib.convertitore_acom_fhir.FHIR;

import it.unimib.convertitore_acom_fhir.Util.ObservationsType;

public class Coding {

    private String system;
    private String version;
    private ObservationsType code;
    private String display;
    private boolean userSelected;

    public Coding(ObservationsType code)    {
        this.code = code;
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
    public ObservationsType getCode() {
        return code;
    }
    public void setCode(ObservationsType code) {
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
