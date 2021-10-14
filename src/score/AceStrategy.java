package score;

import ch.aplu.jcardgame.Card;
import pasur.Player;
import pasur.Rank;

import java.util.ArrayList;

public class AceStrategy implements IScoreStrategy {
    private final Enum RANK = Rank.ACE;
    private final int POINT = 1;

    public AceStrategy(){}

    @Override
    public int calculateScores(Player player) {
        ArrayList<Card> pickedCards = player.getPickedCards().getCardList();
        int counter = 0;

        for(Card card: pickedCards) {
            if(card.getRank() == RANK) {
                counter += 1;
            }
        }

        return counter * POINT;
    }


}
