package multiple_case_switch_expressions;

import java.util.Arrays;
import java.util.Objects;

public enum PlayerType {
    TENNIS(TeamSport.YES_TEAM_PLAY),
    SOCCER(TeamSport.YES_TEAM_PLAY),
    HOCKEY(TeamSport.YES_TEAM_PLAY),
    VOLLEY_BALL(TeamSport.YES_TEAM_PLAY),
    SWIMMER(TeamSport.NO_TEAM_PLAY),
    UNKNOWN(null);

    private final TeamSport teamSport;

    PlayerType(TeamSport teamSport) {
        this.teamSport = teamSport;
    }

    static PlayerType getPlayerTypeViaString(String input) {
        return Arrays.asList(PlayerType.values()).stream()
                .filter(type -> type.toString().equals(input))
                .findAny()
                .orElse(PlayerType.UNKNOWN);
    }

    String isItTeamPlay() {
        if(teamSport == null) {
            return "Not a valid sport given";
        }
        return teamSport.toString();
    }

    enum TeamSport {
        YES_TEAM_PLAY("Yes there is teamplay"),
        NO_TEAM_PLAY("No there's no teamplay");

        private final String teamPlay;

        TeamSport(String teamPlay) {
            this.teamPlay = teamPlay;
        }

        @Override
        public String toString() {
            return Objects.requireNonNullElse(teamPlay, "No information known");
        }
    }
}
