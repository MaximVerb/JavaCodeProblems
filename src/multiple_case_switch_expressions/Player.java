package multiple_case_switch_expressions;

public class Player {
    private final PlayerType playerType;

    Player(PlayerType playerType) {
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Is there teamplay?  " + this.playerType.isItTeamPlay();
    }
}
