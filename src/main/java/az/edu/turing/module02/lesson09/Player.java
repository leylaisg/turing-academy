package az.edu.turing.module02.lesson09;

import java.util.Objects;

public class Player implements Comparable<Player> {
    public final long id;
    public final String name;
    public final int score;


    public Player(long id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;

    }

    @Override
    public String toString() {
        return "{id=%d, name='%s', score=%d}".formatted(id, name, score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && score == player.score && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    @Override
    public int compareTo(Player that) {
        return Long.compare(this.id, that.id);
    }
}