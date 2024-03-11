package objects_immutability_switch_exp.checking_null_and_throwing_specific_exc;

import java.util.Objects;

public class CarImproved {
    private final String name;
    private final String color;
    private final static String BLACK= "It could be black";

    CarImproved(String name, String color) {
        this.name = MyObjects.requireNonNullElseThrow(name, new UnsupportedOperationException("name cannot be null here"));
        this.color = MyObjects.requireNotNullElseThrow(color, () ->
                new UnsupportedOperationException("Color cannot be set as null"));
    }
}
