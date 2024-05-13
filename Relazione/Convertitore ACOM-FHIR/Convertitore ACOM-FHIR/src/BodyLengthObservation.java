public class BodyLengthObservation extends NumericObservation{

    public BodyLengthObservation(float value, UnitCode unitCode)  {
        this.observationType = ObservationsType.MDC_RATIO_MASS_BODY_ACTUAL;
        this.value = value;
        this.unit = unitCode;
    }
    
}
