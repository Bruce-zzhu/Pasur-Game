package score;

import ch.aplu.jcardgame.Card;
import pasur.Player;
import pasur.Rank;
import pasur.Suit;

import java.util.ArrayList;

public class DiamondsTenStrategy implements IScoreStrategy {
    private final Enum RANK = Rank.TEN;
    private final Enum SUIT = Suit.DIAMONDS;
    private final int POINT = 3;

    public DiamondsTenStrategy(){}

    @Override
    public int calculateScores(Player player) {
        Card card = player.getPickedCards().getCard(SUIT, RANK);

        if(card != null) {
            return POINT;
        }

        return 0;
    }
}
