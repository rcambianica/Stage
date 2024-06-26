package it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.bloodPressureObs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

import it.unimib.convertitore_acom_fhir.ACOM.CompoundObservation.CompoundObservation;
import it.unimib.convertitore_acom_fhir.ACOM.CompoundObservation.NumericComponent;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.SupplementalInfo;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class BloodPressureObservation extends CompoundObservation {

        public BloodPressureObservation() {
                setId(UUID.randomUUID().toString());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
                setTimestamp(sdf.format(new Date()));
                setType(ObservationsType.MDC_PRESS_BLD_NON_INV);
                SupplementalInfo supplementalInfo[] = new SupplementalInfo[1];
                supplementalInfo[0] = SupplementalInfo.MDC_UPEXT_FOREARM;
                setSupplementalInfo(supplementalInfo);
                NumericComponent componentType[] = new NumericComponent[2];
                componentType[0] = new NumericComponent(ObservationsType.MDC_PRESS_BLD_NON_INV_SYS, 107,
                                UnitCode.MDC_DIM_MMHG);
                componentType[1] = new NumericComponent(ObservationsType.MDC_PRESS_BLD_NON_INV_DIA, 60,
                                UnitCode.MDC_DIM_MMHG);
                setComponents(componentType);
        }

        public BloodPressureObservation(SupplementalInfo supplementalInfo[]) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
                setTimestamp(sdf.format(new Date()));
                setType(ObservationsType.MDC_PRESS_BLD_NON_INV);
                setSupplementalInfo(supplementalInfo);
                NumericComponent componentType[] = new NumericComponent[2];
                componentType[0] = new NumericComponent(ObservationsType.MDC_PRESS_BLD_NON_INV_SYS, 107,
                                UnitCode.MDC_DIM_MMHG);
                componentType[1] = new NumericComponent(ObservationsType.MDC_PRESS_BLD_NON_INV_DIA, 60,
                                UnitCode.MDC_DIM_MMHG);
                setComponents(componentType);
        }
}
