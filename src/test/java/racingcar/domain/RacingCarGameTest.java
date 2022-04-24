package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.vo.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class RacingCarGameTest {

    @Test
    @DisplayName("랜덤값 4 이상인 경우 자동차 전진")
    void playWithFourOrMore() {
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("pobi", new Location(0)),
                new Car("woni", new Location(0)),
                new Car("jun", new Location(0))));
        RacingCarGame racingCarGame = new RacingCarGame(cars, new SatisfiedCondition());

        racingCarGame.play();

        Assertions.assertThat(cars.get(0).getLocation()).isEqualTo(1);
        Assertions.assertThat(cars.get(1).getLocation()).isEqualTo(1);
        Assertions.assertThat(cars.get(2).getLocation()).isEqualTo(1);
    }

    @Test
    @DisplayName("랜덤값 3 이하인 경우 자동차 전진하지 않음")
    void playWithThreeOrLess() {
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("pobi", new Location(0)),
                new Car("woni", new Location(0)),
                new Car("jun", new Location(0))));
        RacingCarGame racingCarGame = new RacingCarGame(cars, new DisSatisfiedCondition());

        racingCarGame.play();

        Assertions.assertThat(cars.get(0).getLocation()).isEqualTo(0);
        Assertions.assertThat(cars.get(1).getLocation()).isEqualTo(0);
        Assertions.assertThat(cars.get(2).getLocation()).isEqualTo(0);
    }

    static class SatisfiedCondition implements Condition {

        @Override
        public boolean isSatisfied() {
            return true;
        }
    }

    static class DisSatisfiedCondition implements Condition {

        @Override
        public boolean isSatisfied() {
            return false;
        }
    }

}