package objects_immutability_switch_exp.checking_null_but_returning_default_values;

import objects_immutability_switch_exp.checking_null_and_throwing_specific_exc.MyObjects;

import java.awt.*;
import java.util.Objects;

public class CarImproved {
    private final String name;
    private final Color color;
    private final static String BLACK= "It could be black";


    CarImproved(String name, Color color) {
        this.name = Objects.requireNonNullElse(name, "Thomas");
        this.color = Objects.requireNonNullElseGet(color, () -> new Color(0,0,0));
    }
}
