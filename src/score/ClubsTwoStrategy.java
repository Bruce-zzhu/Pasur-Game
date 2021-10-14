package score;

import ch.aplu.jcardgame.Card;
import pasur.Player;
import pasur.Rank;
import pasur.Suit;

import java.util.ArrayList;

public class ClubsTwoStrategy implements IScoreStrategy {
    private final Enum RANK = Rank.TWO;
    private final Enum SUIT = Suit.CLUBS;
    private final int POINT = 2;

    public ClubsTwoStrategy(){}

    @Override
    public int calculateScores(Player player) {
        ArrayList<Card> pickedCards = player.getPickedCards().getCardList();
        boolean has = false;

        for(Card card: pickedCards) {
            if(card.getRank() == RANK && card.getSuit() == SUIT) {
                has = true;
                break;
            }
        }

        if(has) {
            return POINT;
        }

        return 0;
    }
}
