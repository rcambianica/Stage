package it.unimib.convertitore_acom_fhir;

public interface ConverterToFHIR {
    // metodo che converte un'osservazione ACOM in FHIR ritornando una stringa in
    // formato json
    public abstract String converter();
}
