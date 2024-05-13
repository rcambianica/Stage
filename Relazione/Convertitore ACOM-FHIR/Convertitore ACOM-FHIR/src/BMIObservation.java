public class BMIObservation extends NumericObservation {

    public BMIObservation(float value) {
        this.observationType = ObservationsType.MDC_RATIO_MASS_BODY_LEN_SQ;
        this.value = value;
        this.unit = UnitCode.MDC_DIM_KILO_G_PER_M_SQ; 
    }
}
