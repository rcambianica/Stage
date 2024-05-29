package it.unimib.convertitore_acom_fhir.FHIR;

public class Range {

    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Range(int low, int high) {
        this.low = low;
        this.high = high;
    }
}
