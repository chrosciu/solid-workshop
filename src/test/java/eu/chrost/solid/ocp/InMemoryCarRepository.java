package eu.chrost.solid.ocp;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class InMemoryCarRepository implements CarRepository {
    private final List<Car> cars;

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
