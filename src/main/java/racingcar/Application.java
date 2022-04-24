package racingcar;

import racingcar.common.RandomGenerator;
import racingcar.domain.Car;
import racingcar.domain.RacingCarGame;
import racingcar.domain.RandomNumCondition;
import racingcar.view.InputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String[] carNames = InputView.scanCarNames();

        List<Car> cars = Car.createBatch(carNames);
        RacingCarGame racingCarGame = new RacingCarGame(cars, new RandomNumCondition(new RandomGenerator(0, 9)));
        racingCarGame.play();
    }
}
