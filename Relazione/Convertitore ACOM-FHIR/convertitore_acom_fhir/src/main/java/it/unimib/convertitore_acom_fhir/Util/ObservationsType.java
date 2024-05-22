package it.unimib.convertitore_acom_fhir.Util;

public enum ObservationsType {

    TEMPERATURE,
    BLOOD_PRESSURE,
    GLUCOSE_METER,
    PULSE_OXIMETER,
    WEIGHT_SCALE,
    ECG,

    // ACOM COMPOUND OBSERVATION CLASS

    ACOM_COMPONENT_NUMERIC,
    ACOM_COMPONENT_DISCRETE,
    ACOM_COMPONENT_STRING,
    ACOM_COMPONENT_SA,

    /* SOTTOTIPI DI OSSERVAZIONI PER LE IMPLEMENTAZIONI PRATICHE */

    // IEEE 11073-10408 THERMOMETER
    MDC_TEMP_RECT,
    MDC_TEMP_ORAL,
    MDC_TEMP_EAR,
    MDC_TEMP_FINGER,
    MDC_TEMP_TOE,
    MDC_TEMP_AXILLA,
    MDC_TEMP_GIT,
    MDC_TEMP_BODY,
    MDC_TEMP_TYMP,

    // IEEE 11073-10407 BLOOD PRESSURE
    MDC_PRESS_BLD_NON_INV,
    MDC_PRESS_BLD_NON_INV_SYS,
    MDC_PRESS_BLD_NON_INV_DIA,
    MDC_PULS_RATE_NON_INV,
    MDC_BLOOD_PRESSURE_MEASUREMENT_STATUS,

    // IEEE 11073-10417 GLUCOSE METER
    MDC_CONC_GLU_UNDETERMINED_WHOLEBLOOD,
    MDC_CONC_GLU_UNDETERMINED_PLASMA,
    MDC_CONC_GLU_CONTROL_LEVEL_LOW,
    MDC_CONC_GLU_CONTROL_LEVEL_MEDIUM,
    MDC_CONC_GLU_CONTROL_LEVEL_HIGH,
    MDC_CONC_GLU_CAPILLARY_WHOLEBLOOD,
    MDC_CONC_GLU_CAPILLARY_PLASMA,
    MDC_CONC_GLU_VENOUS_WHOLEBLOOD,
    MDC_CONC_GLU_VENOUS_PLASMA,
    MDC_CONC_GLU_ARTERIAL_WHOLEBLOOD,
    MDC_CONC_GLU_ARTERIAL_PLASMA,
    MDC_CONC_GLU_CONTROL,
    MDC_CONC_GLU_ISF,

    // IEEE 11073-10404 PULSE OXIMETER
    MDC_PULS_OXIM_SAT_O2,
    MDC_PULS_OXIM_PULS_RATE,
    MDC_SAT_O2_QUAL,
    MDC_PULS_OXIM_PLETH,
    MDC_PULS_OXIM_DEV_STATUS,

    // IEEE 11073-10415 WEIGHT SCALE
    MDC_MASS_BODY_ACTUAL,
    MDC_RATIO_MASS_BODY_ACTUAL,
    MDC_RATIO_MASS_BODY_LEN_SQ,

    // IEEE 11073-10406 BASIC ECG OR HEART RATE
    MDC_ECG_HEART_RATE,
    MDC_ECG_HEART_RATE_INSTANT,
    MDC_ECG_TIME_PD_RR_GL,
    MDC_ECG_ELEC_POTL,
    MDC_ECG_ELEC_POTL_I,
    MDC_ECG_ELEC_POTL_II,
    MDC_ECG_ELEC_POTL_III,
    MDC_ECG_ELEC_POTL_AVR,
    MDC_ECG_ELEC_POTL_AVL,
    MDC_ECG_ELEC_POTL_AVF,
    MDC_ECG_ELEC_POTL_V1,
    MDC_ECG_ELEC_POTL_V2,
    MDC_ECG_ELEC_POTL_V3,
    MDC_ECG_ELEC_POTL_V4,
    MDC_ECG_ELEC_POTL_V5,
    MDC_ECG_ELEC_POTL_V6,
    MDC_ECG_DEV_STAT
}
