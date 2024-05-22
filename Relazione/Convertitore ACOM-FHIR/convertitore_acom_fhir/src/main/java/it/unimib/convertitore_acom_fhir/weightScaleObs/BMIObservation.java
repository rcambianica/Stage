package it.unimib.convertitore_acom_fhir.weightScaleObs;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BMIObservation extends NumericObservation {

    public BMIObservation(float value) {
        super(value, UnitCode.MDC_DIM_KILO_G_PER_M_SQ, ObservationsType.MDC_RATIO_MASS_BODY_LEN_SQ);
        setTimestamp(new Date());
    }
}
