package it.unimib.convertitore_acom_fhir.bloodPressureObs;

import java.util.Date;

import it.unimib.convertitore_acom_fhir.CompoundObservation;
import it.unimib.convertitore_acom_fhir.NumericObservation;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BloodPressureObservation extends CompoundObservation {

    public BloodPressureObservation() {
        setTimestamp(new Date());
        setType(ObservationsType.MDC_PRESS_BLD_NON_INV);
        SupplementalInfo supplementalInfo[] = new SupplementalInfo[1];
        supplementalInfo[0] = SupplementalInfo.MDC_UPEXT_FOREARM;
        setSupplementalInfo(supplementalInfo);
        NumericObservation componentType[] = new NumericObservation[2];
        componentType[0] = new NumericObservation(107, UnitCode.MDC_DIM_MMHG,
                ObservationsType.MDC_PRESS_BLD_NON_INV_SYS);
        componentType[1] = new NumericObservation(60, UnitCode.MDC_DIM_MMHG,
                ObservationsType.MDC_PRESS_BLD_NON_INV_DIA);
        setComponents(componentType);
    }

    public BloodPressureObservation(SupplementalInfo supplementalInfo[]) {
        setTimestamp(new Date());
        setType(ObservationsType.MDC_PRESS_BLD_NON_INV);
        setSupplementalInfo(supplementalInfo);
        NumericObservation componentType[] = new NumericObservation[2];
        componentType[0] = new NumericObservation(107, UnitCode.MDC_DIM_MMHG,
                ObservationsType.MDC_PRESS_BLD_NON_INV_SYS);
        componentType[1] = new NumericObservation(60, UnitCode.MDC_DIM_MMHG,
                ObservationsType.MDC_PRESS_BLD_NON_INV_DIA);
        setComponents(componentType);
    }
}
