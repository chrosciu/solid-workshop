package eu.chrost.solid.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
class CarSearch {
    private final CarRepository repository;

    public List<Car> findByName(String name) {
        return repository.getCars().stream().filter(c -> name.equals(c.name())).collect(Collectors.toList());
    }
}
