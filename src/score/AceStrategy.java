package score;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;


public class AceStrategy implements IScoreStrategy {
    private final Enum RANK = Rank.ACE;
    private final int POINT = 1;

    public AceStrategy(){}

    @Override
    public int calculateScores(Player player) {
        Hand pickedCards = player.getPickedCards();
        int count = pickedCards.getNumberOfCardsWithRank(RANK);

        return count * POINT;
    }


}
