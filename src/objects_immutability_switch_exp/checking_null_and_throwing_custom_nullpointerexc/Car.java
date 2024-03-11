package objects_immutability_switch_exp.checking_null_and_throwing_custom_nullpointerexc;

public class Car {
    private final String name;
    private final String color;

    Car(String name, String color) {
        if(name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        if(color == null) {
            throw new NullPointerException("Color cannot be blank");
        }
        this.name = name;
        this.color = color;
    }
}
