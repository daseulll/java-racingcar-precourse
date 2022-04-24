package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.RacingCarGame;

public class ResultView {
    public static void showResult(RacingCarGame game) {
        for (Car car : game.getCars()) {
            showCarName(car);
            showLocation(car);
        }
        System.out.printf("\n");
    }

    private static void showCarName(Car car) {
        System.out.printf(car.getName() + " : ");
    }

    private static void showLocation(Car car) {
        for (int i = 0; i < car.getLocation() + 1; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n");

    }
}
