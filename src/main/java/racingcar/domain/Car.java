package racingcar.domain;

import net.bytebuddy.asm.Advice;
import racingcar.vo.Location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Car {
    private final String name;
    private final Location location;

    public Car(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location.getLocation();
    }

    public void proceed() {
        location.move(1);
    }

    public static List<Car> createBatch(String[] carNames) {
        List<Car> cars = new ArrayList<>();

        for (String carName : carNames) {
            cars.add(new Car(carName, new Location(0)));
        }
        return cars;
    }

}
