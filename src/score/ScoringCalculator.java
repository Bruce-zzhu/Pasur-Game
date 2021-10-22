package score;

import java.util.HashMap;
import java.util.Map;

import pasur.Player;
import score.IScoreStrategy;
import score.ScoringComposite;

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

    /**
     * Calculate scores of each player
     * @param players
     * @return a map containing each player and their scores
     */
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
