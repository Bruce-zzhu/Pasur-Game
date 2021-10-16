package scoring;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Rank;
import pasur.Suit;

public class ClubsTwoStrategy implements IScoreStrategy {
    private final int POINTS = 3;
    private final Enum RANK = Rank.TWO;
    private final Enum SUIT = Suit.CLUBS;

    @Override
    public int calculateScore(Player player) {
        Hand pickedCards = player.getPickedCards();
        // this would be nice:
        // if pickedCards.contains(Rank.JACK);

        for (Card card : pickedCards.getCardList()) {
            if (card.getRank() == RANK && card.getSuit() == SUIT) {
                return POINTS;
            }
        }
        return 0;
    }
}
