package eu.chrost.solid.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class CarSearch {
    private final CarRepository repository;

    @Deprecated
    public List<Car> findByBrand(String brand) {
        return findBy(new BrandCondition(brand));
    }

    @Deprecated
    public List<Car> findByMaxPrice(int maxPrice) {
        return findBy(new MaxPriceCondition(maxPrice));
    }

    public List<Car> findBy(Predicate<Car> condition) {
        return repository.getCars().stream().filter(condition).collect(Collectors.toList());
    }
}
