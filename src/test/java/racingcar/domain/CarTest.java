package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class CarTest {
    @Test
    @DisplayName("입력한 자동차 이름 개수만큼 Car 객체 생성되는지 확인")
    void createBatch() {
        List<Car> cars = Car.createBatch(new String[]{"pobi", "woni", "jun"});

        Assertions.assertThat(cars).hasSize(3);
    }

    @Test
    @DisplayName("입력한 자동차 이름대로 Car 객체 생성되는지 확인")
    void createBatchCarName() {
        List<Car> cars = Car.createBatch(new String[]{"pobi", "woni", "jun"});

        Assertions.assertThat(cars.get(0).getName()).isEqualTo("pobi");
        Assertions.assertThat(cars.get(1).getName()).isEqualTo("woni");
        Assertions.assertThat(cars.get(2).getName()).isEqualTo("jun");
    }

    @Test
    @DisplayName("입력한 자동차 이름이 5자 초과할 경우 예외 발생")
    void validateCarName() {
        Assertions.assertThatThrownBy(() -> Car.createBatch(new String[]{"invalidName", "pobi", "woni"}))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 자동차 이름은 5자 이하여야 합니다.");
    }
}