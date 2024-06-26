package it.unimib.convertitore_acom_fhir;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import it.unimib.convertitore_acom_fhir.ACOM.ACOMObservation;
import it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.temperatureObs.TemperatureObservation;
import it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs.BMIObservation;
import it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs.BodyLengthObservation;
import it.unimib.convertitore_acom_fhir.ACOM.DeviceSpecializations.weightScaleObs.BodyMassObservation;
import it.unimib.convertitore_acom_fhir.Util.Costants;
import it.unimib.convertitore_acom_fhir.Util.ObservationsType;
import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static ObservationsType oType;
    private static UnitCode unit;
    private static float value;

    public static void main(String[] args) throws IOException {

        /*
         * leggo i file di osservazioni (per ora solo quello delle osservazioni di
         * temperatura)
         * salvando le singole osservazioni in un array di appoggio, poi utilizzerò un
         * arraylist
         * per aggiungere eventuali osservazioni
         */
        JsonReader reader = new JsonReader(new FileReader(Costants.ACOM_OBS_FILE));
        ACOMObservation[] observations = new Gson().fromJson(reader, TemperatureObservation[].class);
        List<ACOMObservation> oList = new ArrayList<>();
        for (ACOMObservation observation : observations) {
            oList.add(observation);
        }

        int scelta = -1;

        while (scelta != 3) {
            System.out.println("- GENERATORE DI OSSERVAZIONI ACOM (IEEE 11073-10206) -");
            System.out.println("Selezionare il tipo di osservazioni che si vuole generare:");
            System.out.println("1 - Temperature Observations (IEEE 11073-10408)");
            System.out.println("2 - Weight Scale Observations (IEEE 11073-10415)");
            System.out.println("3 - uscita");

            scelta = input.nextInt();
            if (scelta != 3)
                oList.add(generateObservation(scelta));
        }

        // sovrascrivo i file json solo se ho effettivamente generato nuove
        // osservazioni

        if (observations.length != oList.size()) {
            // sovrascrivo il file ACOM
            Gson gson = new Gson();
            String json = gson.toJson(oList);
            PrintWriter outputFile = null;
            try {
                outputFile = new PrintWriter(Costants.ACOM_OBS_FILE);
                outputFile.println(json);
            } catch (FileNotFoundException e) {
                System.out.println("Errore nell'apertura del file temperature_obs.json");
                System.exit(0);
            }
            outputFile.close();

            // converto le osservazioni ACOM in FHIR e sovrascrivo il file FHIR
            json = "[";
            for (ACOMObservation temperatureObservation : oList) {
                if (json.equals("["))
                    json = json + temperatureObservation.converter();
                else
                    json = json + ',' + temperatureObservation.converter();

            }
            json = json + ']';
            outputFile = null;
            try {
                outputFile = new PrintWriter(Costants.FHIR_OBS_FILE);
                outputFile.println(json);
            } catch (FileNotFoundException e) {
                System.out.println("Errore nell'apertura del file temperature_obs.json");
                System.exit(0);
            }
            outputFile.close();
        }

        reader.close();
        input.close();

    }

    private static ACOMObservation generateObservation(int obsType) {
        int scelta = -1;
        ACOMObservation obs = null;
        switch (obsType) {
            case 1: {
                System.out.println("1 - TEMPERATURE OBSERVATIONS - Scelta dei parametri");
                System.out.println("Tipo di temperatura:");
                int cont = 1;
                for (ObservationsType observationsType : ObservationsType.values()) {
                    if (observationsType.name().contains("_TEMP_")) {
                        System.out.println(cont + " - " + observationsType.name());
                        cont++;
                    }
                }
                scelta = input.nextInt();
                switch (scelta) {
                    case 1:
                        oType = ObservationsType.MDC_TEMP_RECT;
                        break;
                    case 2:
                        oType = ObservationsType.MDC_TEMP_ORAL;
                        break;
                    case 3:
                        oType = ObservationsType.MDC_TEMP_EAR;
                        break;
                    case 4:
                        oType = ObservationsType.MDC_TEMP_FINGER;
                        break;
                    case 5:
                        oType = ObservationsType.MDC_TEMP_TOE;
                        break;
                    case 6:
                        oType = ObservationsType.MDC_TEMP_AXILLA;
                        break;
                    case 7:
                        oType = ObservationsType.MDC_TEMP_GIT;
                        break;
                    case 8:
                        oType = ObservationsType.MDC_TEMP_BODY;
                        break;
                    case 9:
                        oType = ObservationsType.MDC_TEMP_TYMP;
                        break;

                    default:
                        oType = ObservationsType.MDC_TEMP_BODY;
                        break;
                }

                System.out.print("Valore temperatura: ");
                value = input.nextFloat();

                System.out.println("Unità di misura:");
                System.out.println("1 - MDC_DIM_DEGC");
                System.out.println("2 - MDC_DIM_FAHR");
                System.out.println("3 - MDC_DIM_KELVIN");
                scelta = input.nextInt();
                switch (scelta) {
                    case 1:
                        unit = UnitCode.MDC_DIM_DEGC;
                        break;
                    case 2:
                        unit = UnitCode.MDC_DIM_FAHR;
                        break;
                    case 3:
                        unit = UnitCode.MDC_DIM_KELVIN;
                        break;
                    default:
                        unit = UnitCode.MDC_DIM_DEGC;
                        break;
                }

                obs = new TemperatureObservation(value, oType, unit);
                System.out.println(obs);
                break;
            }

            case 2: {
                System.out.println("2 - WEIGHT SCALE OBSERVATIONS - scelta dei parametri");
                System.out.println("Tipo di osservazione:");
                System.out.println("1 - Body mass observation");
                System.out.println("2 - Body length observation");
                System.out.println("3 - BMI observation");
                scelta = input.nextInt();
                switch (scelta) {
                    case 1: {
                        System.out.println("Valore misurazione: ");
                        value = input.nextFloat();
                        System.out.println("Unità di misura:");
                        System.out.println("1 - KG");
                        System.out.println("2 - LB");
                        scelta = input.nextInt();
                        if (scelta == 1)
                            unit = UnitCode.MDC_DIM_KILO_G;
                        else
                            unit = UnitCode.MDC_DIM_LB;
                        obs = new BodyMassObservation(value, unit);
                        break;
                    }
                    case 2: {
                        System.out.println("Valore misurazione: ");
                        value = input.nextFloat();
                        System.out.println("Unità di misura:");
                        System.out.println("1 - CM");
                        System.out.println("2 - INCH");
                        scelta = input.nextInt();
                        if (scelta == 1)
                            unit = UnitCode.MDC_DIM_CENTI_M;
                        else
                            unit = UnitCode.MDC_DIM_INCH;
                        obs = new BodyLengthObservation(value, unit);
                        break;
                    }
                    case 3: {
                        System.out.println("Valore misurazione: ");
                        value = input.nextFloat();
                        // in un sistema verosimile questa parte dovrebbe essere gestita in modo più
                        // consistente, questa implementazione permette di creare un'osservazione
                        // fittizia
                        System.out.println("Misura derivata da: ");
                        String []derivedFrom = new String[2];
                        derivedFrom[0] = input.nextLine();
                        derivedFrom[1] = input.nextLine();
                        obs = new BMIObservation(derivedFrom, value);
                        break;
                    }

                    default:
                        break;
                }
            }

            case 6: {

                break;
            }

            default:
                obs = new TemperatureObservation();
                break;
        }
        return obs;
    }
}