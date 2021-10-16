package scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;

public class SurStrategy implements IScoreStrategy {
    private final int POINTS = 5;

    @Override
    public int calculateScore(Player player) {
        int num_surs = player.getSurs().getNumberOfCards();
        return POINTS * num_surs;
    }
}
