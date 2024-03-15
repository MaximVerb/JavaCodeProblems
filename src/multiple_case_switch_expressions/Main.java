package multiple_case_switch_expressions;
import java.util.Scanner;

import static multiple_case_switch_expressions.PlayerType.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Please fill in a sport");
        Scanner in = new Scanner(System.in);
        while ( 1 > 0) {
        String input = in.nextLine();
            System.out.println(createPlayer(input));
        }
    }

    private static Player createPlayer(String playerType) {
        PlayerType nameSport = PlayerType.getPlayerTypeViaString(playerType);
        return switch (nameSport) {
            case HOCKEY,SOCCER,TENNIS, VOLLEY_BALL -> new Player(HOCKEY);
            case SWIMMER -> new Player(SWIMMER);
            default -> new Player(UNKNOWN);
        };
    }
}
