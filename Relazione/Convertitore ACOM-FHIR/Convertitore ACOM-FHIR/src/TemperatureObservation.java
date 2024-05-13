import java.util.Date;

public class TemperatureObservation extends NumericObservation{

    public TemperatureObservation(float value, ObservationsType temperatureType, UnitCode unit, float accuracy) {
        this.observationType = temperatureType;
        this.value = value;
        this.unit = unit;
        this.accuracy = accuracy;
        this.timeStamp = new Date();
    }

    @Override
    public String toString() {
        return super.toString() + "TemperatureObservation{" +
                "value= " + value +
                ", unit= " + unit +
                ", accuracy= " + accuracy + 
                '}';
    }
}