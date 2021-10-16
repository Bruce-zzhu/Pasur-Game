package scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;

public class AceStrategy implements IScoreStrategy {
    private int num_Ace = 0;
    private final int POINTS = 1;
    private final Enum RANK = Rank.ACE;

    @Override
    public int calculateScore(Player player) {
        Hand pickedCards = player.getPickedCards();
        num_Ace = pickedCards.getNumberOfCardsWithRank(RANK);
        return num_Ace * POINTS;
    }
}
