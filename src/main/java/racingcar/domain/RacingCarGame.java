package racingcar.domain;

import java.util.List;

public class RacingCarGame {
    private final List<Car> cars;
    private final Condition condition;

    public RacingCarGame(List<Car> cars, Condition condition) {
        this.cars = cars;
        this.condition = condition;
    }

    public void play() {
        proceedCars();
    }

    private void proceedCars() {
        for (Car car : cars) {
            proceedCarByCondition(car, condition);
        }
    }

    private static void proceedCarByCondition(Car car, Condition condition) {
        if (condition.isSatisfied()) {
            car.proceed();
        }
    }

}
