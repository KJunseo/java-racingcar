package racingcar.view;

import racingcar.domain.Names;
import racingcar.domain.Trial;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static Names getNames() {
        String names = scanner.nextLine();
        return new Names(names);
    }

    public static Trial getTrial() {
        String trial = scanner.nextLine();
        return new Trial(trial);
    }
}
