import java.util.Date;
public abstract class Observation {

    private final int patientId = 1;
    protected ObservationsType observationType;
    protected Date timeStamp;

    @Override
    public String toString() {
        return "Observation{" +
                "patientId=" + patientId +
                ", type=" + observationType +
                ", timeStamp=" + timeStamp +
                '}';
    }
}