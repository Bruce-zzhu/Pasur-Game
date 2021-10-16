package scoring;

import ch.aplu.jcardgame.Hand;
import pasur.Player;
import pasur.Suit;

public class MostClubsStrategy implements IScoreStrategy {
    private final int POINTS = 7;
    private final Enum SUIT = Suit.CLUBS;
    private final int THRESHOLD = 7;
    private int num_Clubs = 0;


    @Override
    public int calculateScore(Player player) {
        Hand pickedCards = player.getPickedCards();
        num_Clubs = pickedCards.getNumberOfCardsWithSuit(SUIT);
        if (num_Clubs >= THRESHOLD) {
            return POINTS;
        }
        return 0;
    }
}
