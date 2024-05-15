package it.unimib.convertitore_acom_fhir.weightScaleObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BodyMassObservation extends NumericObservation{
    
    /*TODO capire se e a cosa serve, è presente nella tabella del PDF*/ 
    //private int id;

    public BodyMassObservation(int id, float value, UnitCode unitCode)    {
        //this.id = id;
        this.observationType = ObservationsType.MDC_MASS_BODY_ACTUAL;
        this.value = value;
        this.unit = unitCode;
    }
}

