package switch_expressions_curly_braces.switch_expressions;

import java.util.Scanner;

import static switch_expressions_curly_braces.switch_expressions.PlayerType.*;

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
            case HOCKEY -> {
                System.out.println("Creating hockeyplayer");
                yield new Player(HOCKEY);
            }
            case SOCCER -> {
                System.out.println("Creating soccerplayer");
                yield  new Player(SOCCER);
            }
            case TENNIS ->{
                System.out.println("Creating tennisplayer");
                yield new Player(TENNIS);
            }
            case SWIMMER -> {
                System.out.println("Creating swimmer");
                yield new Player(SWIMMER);
            }
            case VOLLEY_BALL -> {
                System.out.println("Creating volleyballplayer");
                yield new Player(VOLLEY_BALL);
            }
            default -> new Player(UNKNOWN);
        };
    }
}
