package racingcar.domain;

import java.util.Objects;

public class Position implements Comparable<Position> {
    private static final int NEXT = 1;
    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position move() {
        return new Position(position + NEXT);
    }

    public boolean isSame(Position position) {
        return this.position == position.position;
    }

    @Override
    public int compareTo(Position position) {
        return Integer.compare(this.position, position.position);
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
