package eu.chrost.solid.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class CarSearch {
    private final CarRepository repository;

    public List<Car> findByBrand(String brand) {
        return repository.getCars().stream().filter(c -> brand.equals(c.brand())).collect(Collectors.toList());
    }

    public List<Car> findByMaxPrice(int maxPrice) {
        return repository.getCars().stream().filter(c -> c.price() <= maxPrice).collect(Collectors.toList());
    }
}
