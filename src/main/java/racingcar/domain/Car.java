package racingcar.domain;

import net.bytebuddy.asm.Advice;
import racingcar.vo.Location;


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
}
