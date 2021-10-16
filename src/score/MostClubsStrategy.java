package score;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Suit;


public class MostClubsStrategy implements IScoreStrategy {
    private final Enum SUIT = Suit.CLUBS;
    private final int POINT = 7;
    private final int threshold = 7;

    public MostClubsStrategy(){}

    @Override
    public int calculateScores(Player player) {
        Hand pickedCards = player.getPickedCards();
        int count = pickedCards.getNumberOfCardsWithSuit(SUIT);

        if(count >= threshold) {
            return POINT;
        }

        return 0;
    }
}
