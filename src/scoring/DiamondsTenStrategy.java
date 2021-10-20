package scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;
import pasur.Suit;

public class DiamondsTenStrategy implements IScoreStrategy {
    private final int POINTS = 3;
    private final Enum RANK = Rank.TEN;
    private final Enum SUIT = Suit.DIAMONDS;

    @Override
    public int calculateScore(Player player) {
        Hand pickedCards = player.getPickedCards();
        Card card = player.getPickedCards().getCard(SUIT, RANK);

        if(card != null) {
            return POINTS;
        }
        return 0;
    }
}
