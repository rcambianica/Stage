package it.unimib.convertitore_acom_fhir.Util;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.lang.reflect.Field;

public class InizializzatoExclusionStrategy implements ExclusionStrategy {

    private final Object target;

    public InizializzatoExclusionStrategy(Object target) {
        this.target = target;
    }

    @Override
    public boolean shouldSkipField(FieldAttributes f) {
        try {
            Field field = target.getClass().getDeclaredField(f.getName());
            field.setAccessible(true);
            Object value = field.get(target);
            return value == null;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}