package scoring;

import pasur.Player;

import java.util.ArrayList;

public class ScoringComposite implements IScoreStrategy{
    private ArrayList<IScoreStrategy> strategies = new ArrayList<IScoreStrategy>();

    @Override
    public int calculateScore(Player player) {
        int totalPoints = 0;
        for (IScoreStrategy strategy : strategies) {
            totalPoints += strategy.calculateScore(player);
        }
        return totalPoints;
    }

    public void addStrategy(IScoreStrategy strategy) {
        strategies.add(strategy);
    }
}
