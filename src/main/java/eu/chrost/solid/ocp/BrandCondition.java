package eu.chrost.solid.ocp;

import java.util.function.Predicate;

record BrandCondition(String brand) implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.brand().equals(brand);
    }
}
