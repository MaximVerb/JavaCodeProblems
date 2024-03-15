package switch_expressions;

import java.util.Arrays;
import java.util.Scanner;

import static switch_expressions.PlayerType.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please fill in a sport");
        Scanner in = new Scanner(System.in);
        while ( 1 > 0) {
        String input = in.nextLine();
        System.out.println(input);
            System.out.println("The player you just created is " + createPlayer(input));
        }
    }

    private static Player createPlayer(String playerType) {
        PlayerType nameSport = PlayerType.getPlayerTypeViaString(playerType);
        return switch (nameSport) {
            case HOCKEY -> new Player(HOCKEY);
            case SOCCER -> new Player(SOCCER);
            case TENNIS -> new Player(TENNIS);
            case SWIMMER -> new Player(SWIMMER);
            case VOLLEY_BALL -> new Player(VOLLEY_BALL);
            default -> new Player(UNKNOWN);
        };
    }
}
