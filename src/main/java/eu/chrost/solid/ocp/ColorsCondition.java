package eu.chrost.solid.ocp;

import java.util.EnumSet;
import java.util.function.Predicate;

record ColorsCondition(EnumSet<Color> colors) implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return colors.contains(car.color());
    }
}
