package objects_immutability_switch_exp.checking_null_and_throwing_custom_nullpointerexc;

import java.util.Objects;

public class CarImproved {
    private final String name;
    private final String color;
    private final static String BLACK= "It could be black";

    CarImproved(String name, String color) {
        this.name = Objects.requireNonNull(name, "Car name cannot be null");
        this.color = Objects.requireNonNull(color, () -> "Car color cannot be null " + BLACK);//concatentation is only possible using the supplier
    }
}
