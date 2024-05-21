package it.unimib.convertitore_acom_fhir.weightScaleObs;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BMIObservation extends NumericObservation {

    public BMIObservation(float value) {
        this.observationType = ObservationsType.MDC_RATIO_MASS_BODY_LEN_SQ;
        this.value = value;
        this.unit = UnitCode.MDC_DIM_KILO_G_PER_M_SQ;
    }
}
