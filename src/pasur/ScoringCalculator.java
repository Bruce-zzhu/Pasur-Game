package pasur;

import java.util.HashMap;
import java.util.Map;
import score.IScoreStrategy;
import score.ScoringComposite;

public class ScoringCalculator {

    IScoreStrategy scoringComposite;

    public ScoringCalculator() {
        scoringComposite = new ScoringComposite();
    }

    public Map<Player, Integer> calculateScores(Player[] players) {
        Map<Player, Integer> scoresOfPlayers = new HashMap<Player, Integer>();
        int score = 0;
        for(Player player: players) {
            score = scoringComposite.calculateScores(player);
            scoresOfPlayers.put(player, score);
        }
        return scoresOfPlayers;
    }
}
