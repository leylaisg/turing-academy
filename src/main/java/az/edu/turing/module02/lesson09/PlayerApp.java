package az.edu.turing.module02.lesson09;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void mainV1(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
    }

    public static void mainV2(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerComparatorByNameAsc());
        System.out.println(Arrays.toString(players));
    }

    public static void mainV3(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerComparatorByNameDesc());
        System.out.println(Arrays.toString(players));
    }

    public static void mainV4(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerComparatorByNameScoreAndName());
        System.out.println(Arrays.toString(players));
    }

    public static void mainV5(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerComparatorByNameScoreNameId());
        System.out.println(Arrays.toString(players));
    }

    public static void mainV6(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return Long.compare(player1.id, player2.id);
            }
        });
        System.out.println(Arrays.toString(players));
    }
    public static void mainV7(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player2.score > player1.score ? 1
                        : player2.score < player1.score ? -1
                        : player1.name.compareTo(player2.name) != 0 ? player1.name.compareTo(player2.name)
                        : Long.compare(player1.id, player2.id);
            }
        });
        System.out.println(Arrays.toString(players));
    }
    public static void main(String[] args) {
        Player[] players = getPlayers();
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (player1, player2) -> Long.compare(player1.id, player2.id));
        System.out.println(Arrays.toString(players));
    }


    private static Player[] getPlayers() {
        return new Player[]{new Player(5, "amy", 100),
                new Player(3, "david", 100),
                new Player(1, "heraldo", 50),
                new Player(4, "aakansha", 70),
                new Player(2, "aleksa", 150),
        };
    }
}