package it.unimib.convertitore_acom_fhir.FHIR;

import java.util.ArrayList;

public class Meta {
    private ArrayList<String> profile;

    public ArrayList<String> getProfile() {
        return profile;
    }
    

    public void setProfile(ArrayList<String> profile) {
        this.profile = profile;
    }
    
    public void setProfile(String profile)  {
        this.profile.add(profile);
    }
    
    public Meta(String profile) {
        this.profile = new ArrayList<>();
    }
}
