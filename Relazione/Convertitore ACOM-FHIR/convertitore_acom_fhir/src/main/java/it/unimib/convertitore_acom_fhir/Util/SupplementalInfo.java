package it.unimib.convertitore_acom_fhir.Util;

public enum SupplementalInfo {

    // IEEE 11073-10407 BLOOD PRESSURE
    MDC_LOEXT_LEG,
    MDC_LOEXT_LEG_L,
    MDC_LOEXT_LEG_R,
    MDC_LOEXT_THIGH,
    MDC_LOEXT_THIGH_L,
    MDC_LOEXT_THIGH_R,
    MDC_UPEXT_FOREARM,
    MDC_UPEXT_FOREARM_L,
    MDC_UPEXT_FOREARM_R,
    MDC_UPEXT_ARM_UPPER,
    MDC_UPEXT_ARM_UPPER_L,
    MDC_UPEXT_ARM_UPPER_R,

    // IEEE 11073-10417 GLUCOSE METER
    MDC_CTXT_GLU_HEALTH,
    MDC_CTXT_GLU_HEALTH_MINOR,
    MDC_CTXT_GLU_HEALTH_MAJOR,
    MDC_CTXT_GLU_HEALTH_MENSES,
    MDC_CTXT_GLU_HEALTH_STRESS,
    MDC_CTXT_GLU_HEALTH_NONE,
    MDC_CTXT_GLU_SAMPLELOCATION,
    MDC_CTXT_GLU_SAMPLELOCATION_UNDETERMINED,
    MDC_CTXT_GLU_SAMPLELOCATION_OTHER,
    MDC_CTXT_GLU_SAMPLELOCATION_FINGER,
    MDC_CTXT_GLU_SAMPLELOCATION_SUBCUTANEOUS,
    MDC_CTXT_GLU_SAMPLELOCATION_AST,
    MDC_CTXT_GLU_SAMPLELOCATION_EARLOBE,
    MDC_CTXT_GLU_SAMPLELOCATION_CTRLSOLUTION,
    MDC_CTXT_GLU_MEAL,
    MDC_CTXT_GLU_MEAL_PREPRANDIAL,
    MDC_CTXT_GLU_MEAL_BEDTIME,
    MDC_CTXT_GLU_MEAL_POSTPRANDIAL,
    MDC_CTXT_GLU_MEAL_FASTING,
    MDC_CTXT_GLU_MEAL_CASUAL,
    MDC_CTXT_GLU_TESTER,
    MDC_CTXT_GLU_TESTER_SELF,
    MDC_CTXT_GLU_TESTER_HCP,
    MDC_CTXT_GLU_TESTER_LAB,
    MDC_CTXT_MEDICATION_RAPIDACTING,
    MDC_CTXT_MEDICATION_SHORTACTING,
    MDC_CTXT_MEDICATION_INTERMEDIATEACTING,
    MDC_CTXT_MEDICATION_LONGACTING,
    MDC_CTXT_MEDICATION_PREMIX,
    MDC_CTXT_GLU_CARB_BREAKFAST,
    MDC_CTXT_GLU_CARB_LUNCH,
    MDC_CTXT_GLU_CARB_DINNER,
    MDC_CTXT_GLU_CARB_SNACK,
    MDC_CTXT_GLU_CARB_DRINK,
    MDC_CTXT_GLU_CARB_SUPPER,
    MDC_CTXT_GLU_CARB_BRUNCH,
    MDC_CTXT_GLU_CARB_UNDETERMINED,
    MDC_CTXT_GLU_CARB_OTHER,
    MDC_CTXT_GLU_CARB_NO_ENTRY,
    MDC_CTXT_GLU_CARB_NO_INGESTION,

    // IEEE 11073-10404 PULSE OXIMETER
    MDC_MODALITY_FAST,
    MDC_MODALITY_SLOW,
    MDC_MODALITY_SPOT,
    MDC_PULS_OXIM_PULS_CHAR_NOMINAL,
    MDC_PULS_OXIM_PULS_CHAR_MARGINAL,
    MDC_PULS_OXIM_PULS_CHAR_MINIMAL,
    MDC_PULS_OXIM_PULS_CHAR_UNACCEPTABLE,

    // IEEE 11073-10406 BASIC ECG OR HEART RATE
    MDC_ECG_EVT_CTXT_USER,
    MDC_ECG_EVT_CTXT_PERIODIC,
    MDC_ECG_EVT_CTXT_DETECTED,
    MDC_ECG_EVT_CTXT_EXTERNAL
}
