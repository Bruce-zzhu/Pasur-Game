package score;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Deck;
import ch.aplu.jcardgame.Hand;
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
        Card card = player.getPickedCards().getCard(SUIT, RANK);

        if(card != null) {
            return POINT;
        }

        return 0;
    }
}
