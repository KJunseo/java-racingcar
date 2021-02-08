package racingcar.domain;

import java.util.Objects;

public class Racer {
    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final String EMPTY = " ";
    private static final String EMPTY_ERR_MSG = ERROR_PREFIX + "이름으로 공백을 입력할 수 없습니다.";
    private static final String LENGTH_ERR_MSG = ERROR_PREFIX + "이름은 1자 이상, 5자 이내만 가능합니다.";
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public Racer(String name) {
        checkNameValidation(name);
        this.name = name;
    }

    private void checkNameValidation(String name) {
        isEmpty(name);
        isLetterMoreThan1LessThan5(name);
    }

    private void isEmpty(String name) {
        if (name.equals(EMPTY)) {
            throw new IllegalArgumentException(EMPTY_ERR_MSG);
        }
    }

    private void isLetterMoreThan1LessThan5(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(LENGTH_ERR_MSG);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Racer)) {
            return false;
        }
        Racer newRacer = (Racer) o;
        return name.equals(newRacer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
