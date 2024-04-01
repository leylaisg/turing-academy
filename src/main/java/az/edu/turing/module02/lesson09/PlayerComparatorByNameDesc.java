package az.edu.turing.module02.lesson09;

import java.util.Comparator;

public class PlayerComparatorByNameDesc implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        return player2.name.compareTo(player1.name);
    }
}