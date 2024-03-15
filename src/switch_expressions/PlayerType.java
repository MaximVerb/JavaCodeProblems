package switch_expressions;

import java.util.Arrays;

public enum PlayerType {
    TENNIS,
    SOCCER,
    HOCKEY,
    VOLLEY_BALL,
    SWIMMER,
    UNKNOWN;

    static PlayerType getPlayerTypeViaString(String input) {
       return Arrays.asList(PlayerType.values()).stream()
                .filter(type -> type.toString().equals(input))
                .findAny()
                .orElse(PlayerType.UNKNOWN);
    }
}
