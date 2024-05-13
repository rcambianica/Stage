import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Selezionare il tipo di osservazione che si vuole generare:");
        System.out.println("1 - Temperature Observation (IEEE 11073-10408)");
        System.out.println("2 - Blood Pressure Observation (IEEE 11073-10407)");
        System.out.println("3 - Glucose Meter Observation (IEEE 11073-10417)");
        System.out.println("4 - Pulse Oximeter Observation (IEEE 11073-10404)");
        System.out.println("5 - Weight Scale Observation (IEEE 11073-10415)");
        System.out.println("6 - Basic ECG or Heart Rate Observation (IEEE 11073-10406)");

        int scelta = input.nextInt();

        generateObservation(scelta);
        input.close();
    }

    private static void generateObservation(int obsType)  {
        Observation obs;
        switch (obsType) {
            case 1: {
                obs = new TemperatureObservation(36, ObservationsType.MDC_TEMP_BODY, UnitCode.MDC_DIM_DEGC, 100);
                System.out.println(obs.toString());
                break;
            }
                
            case 2: {

                break;
            }

            
            case 3: {
                
                break;
            }

            case 4: {
                
                break;
            }

            case 5: {
                
                break;
            }

            case 6: {
                //obs = new
                break;
            }

            default:
                break;
        }
        //System.out.println(obs.toString());
    }
}
