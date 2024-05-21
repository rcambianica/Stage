package it.unimib.convertitore_acom_fhir;

import it.unimib.convertitore_acom_fhir.Util.UnitCode;

public class NumericObservation extends Observation {
    protected float accuracy;
    protected float value;
    protected UnitCode unit;
}
