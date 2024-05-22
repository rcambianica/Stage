package it.unimib.convertitore_acom_fhir.ACOMDeviceSpecializations.basicEcgObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class ECGHeartRateObs extends NumericObservation{
    
    public ECGHeartRateObs(float value, ObservationsType type, SupplementalInfo supplementalInfo)    {
        super(value, UnitCode.MDC_DIM_BEAT_PER_MIN, type);
    }
}
