package scoring;

import pasur.Player;

import java.util.HashMap;
import java.util.Map;

public class ScoringCalculator {

    ScoringComposite scoringComposite;

    public ScoringCalculator() {
        scoringComposite = new ScoringComposite();
        scoringComposite.addStrategy(new AceStrategy());
        scoringComposite.addStrategy(new JackStrategy());
        scoringComposite.addStrategy(new DiamondsTenStrategy());
        scoringComposite.addStrategy(new MostClubsStrategy());
        scoringComposite.addStrategy(new SurStrategy());
        scoringComposite.addStrategy(new ClubsTwoStrategy());
    }

    public Map<Player, Integer> calculateScores(Player[] players) {
        Map<Player, Integer> playerScores = new HashMap<Player, Integer>();
        int score = 0;
        for(Player player: players) {
            score = scoringComposite.calculateScore(player);
            playerScores.put(player, score);
        }
        return playerScores;
    }
}
