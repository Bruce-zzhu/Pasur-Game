package score;

import ch.aplu.jcardgame.Card;
import pasur.Player;
import pasur.Suit;

import java.util.ArrayList;

public class SurStrategy implements IScoreStrategy {
    private final int POINT = 5;

    public SurStrategy(){}

    @Override
    public int calculateScores(Player player) {
        int numOfSurs = player.getSurs().getNumberOfCards();
        return numOfSurs * POINT;
    }
}
