package scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;

public class JackStrategy implements IScoreStrategy {
    private int num_Jack = 0;
    private final Enum RANK = Rank.JACK;

    @Override
    public int calculateScore(Player player) {
        Hand pickedCards = player.getPickedCards();
        num_Jack = pickedCards.getNumberOfCardsWithRank(RANK);
        return num_Jack;
    }
}
