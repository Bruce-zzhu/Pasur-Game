package score;

import ch.aplu.jcardgame.Card;
import pasur.Player;
import pasur.Rank;
import pasur.Suit;

import java.util.ArrayList;

public class MostClubsStrategy implements IScoreStrategy {
    private final Enum SUIT = Suit.CLUBS;
    private final int POINT = 7;
    private final int threshold = 7;

    public MostClubsStrategy(){}

    @Override
    public int calculateScores(Player player) {
        ArrayList<Card> pickedCards = player.getPickedCards().getCardList();
        int counter = 0;

        for(Card card: pickedCards) {
            if(card.getSuit() == SUIT) {
                counter += 1;
            }
        }

        if(counter >= threshold) {
            return POINT;
        }

        return 0;
    }
}
