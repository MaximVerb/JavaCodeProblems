package objects_immutability_switch_exp.checking_null_and_throwing_specific_exc;

import java.util.function.Supplier;

public final class MyObjects {

    public static <T, X extends Throwable> T requireNonNullElseThrow(T object, X exception) throws X {
        if(object == null) {
            throw exception;
        }
        return object;
    }

    public static <T, X extends Throwable> T requireNotNullElseThrow(
            T obj, Supplier<? extends X> exceptionSupplier) throws X {

        if (obj != null) {
            return obj;
        } else {
            throw exceptionSupplier.get();
        }
    }
}
