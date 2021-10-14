package score;


import pasur.Player;

import java.util.ArrayList;

public class ScoringComposite implements IScoreStrategy {

    private ArrayList<IScoreStrategy> strategies;

    public ScoringComposite() {
        strategies = new ArrayList<>();
        strategies.add(new AceStrategy());
        strategies.add(new JackStrategy());
        strategies.add(new DiamondsTenStrategy());
        strategies.add(new MostClubsStrategy());
        strategies.add(new SurStrategy());
        strategies.add(new ClubsTwoStrategy());
    }

    @Override
    public int calculateScores(Player player) {
        int scores = 0;
        for(IScoreStrategy s: strategies) {
            scores += s.calculateScores(player);
        }
        return scores;
    }

}
