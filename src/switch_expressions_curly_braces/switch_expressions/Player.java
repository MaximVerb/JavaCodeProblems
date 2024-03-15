package switch_expressions_curly_braces.switch_expressions;

public class Player {
    private final PlayerType playerType;

    Player(PlayerType playerType) {
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "The player is a " + this.playerType.name();
    }
}
