package eu.chrost.solid.ocp;

import java.util.function.Predicate;

record MaxPriceCondition(int maxPrice) implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.price() <= maxPrice;
    }
}
