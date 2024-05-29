package it.unimib.convertitore_acom_fhir.FHIR;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Value {

    private String valueString;
    private boolean valueBoolean;
    private int valueInteger;
    private Range valueRange;
    /*
     * private Ratio valueRatio;
     * private SampledData valueSampledData;
     * private Date valueTime;
     */

    private String valueDateTime;

    /*
     * private Period valuePeriod;
     * private Attachment valueAttachment
     */

    public Value(String valueString)    {
        this.valueString = valueString;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setValueDateTime(sdf.format(new Date()));
    }

    public Value(boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setValueDateTime(sdf.format(new Date()));
    }

    public Value(int valueInteger) {
        this.valueInteger = valueInteger;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        setValueDateTime(sdf.format(new Date()));
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public boolean isValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }

    public int getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(int valueInteger) {
        this.valueInteger = valueInteger;
    }

    public Range getValueRange() {
        return valueRange;
    }

    public void setValueRange(Range valueRange) {
        this.valueRange = valueRange;
    }

    public String getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }
}
