package az.edu.turing.module02.lesson09;

import java.util.Comparator;

public class PlayerComparatorByNameScoreAndName implements Comparator<Player> {


    @Override
    public int compare(Player player1, Player player2) {
        return player2.score > player1.score ? 1
                : player2.score < player1.score ? -1
                : player1.name.compareTo(player2.name);
    }
}