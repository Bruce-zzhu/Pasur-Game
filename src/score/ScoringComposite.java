package score;


import pasur.Player;

import java.util.ArrayList;

public class ScoringComposite implements IScoreStrategy {

    private ArrayList<IScoreStrategy> strategies;

    public ScoringComposite() {
        strategies = new ArrayList<>();
    }

    /**
     * Iterate through each strategy and calculate aggregate scores
     * @param player
     * @return
     */
    @Override
    public int calculateScores(Player player) {
        int scores = 0;
        for(IScoreStrategy s: strategies) {
            scores += s.calculateScores(player);
        }
        return scores;
    }

    public void addStrategy(IScoreStrategy strategy) {
        strategies.add(strategy);
    }

}
