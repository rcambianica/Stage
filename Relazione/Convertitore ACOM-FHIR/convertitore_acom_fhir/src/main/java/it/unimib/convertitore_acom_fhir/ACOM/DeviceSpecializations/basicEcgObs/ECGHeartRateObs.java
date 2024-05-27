package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.basicEcgObs;

import it.unimib.convertitore_acom_fhir.ACOM.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class ECGHeartRateObs extends NumericObservation{
    
    public ECGHeartRateObs(float value, ObservationsType type, SupplementalInfo supplementalInfo)    {
        super(value, UnitCode.MDC_DIM_BEAT_PER_MIN, type);
    }
}
