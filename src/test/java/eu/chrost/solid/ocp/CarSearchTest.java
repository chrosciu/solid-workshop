package eu.chrost.solid.ocp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static eu.chrost.solid.ocp.Color.BLACK;
import static eu.chrost.solid.ocp.Color.RED;
import static eu.chrost.solid.ocp.Color.WHITE;
import static org.assertj.core.api.Assertions.assertThat;

class CarSearchTest {
    private static final Car FIAT_PUNTO = new Car("Fiat Punto", 1000, BLACK, 5.5);
    private static final Car VW_PASSAT = new Car("VW Passat", 2000, WHITE, 6.5);
    private static final Car POLONEZ_CARO = new Car("Polonez Caro", 500, RED, 15.0);

    private final CarRepository carRepository = new InMemoryCarRepository(List.of(FIAT_PUNTO, VW_PASSAT, POLONEZ_CARO));
    private final CarSearch carSearch = new CarSearch(carRepository);

    @Test
    void shouldBeAbleToPerformSearchByBrand() {
        List<Car> foundCars = carSearch.findByBrand("Fiat Punto");

        assertThat(foundCars).containsExactlyInAnyOrder(FIAT_PUNTO);
    }

    @Test
    void shouldBeAbleToPerformSearchByMaxPrice() {
        List<Car> foundCars = List.of(); // carSearch.findByMaxPrice(1200)

        assertThat(foundCars).containsExactlyInAnyOrder(FIAT_PUNTO, POLONEZ_CARO);
    }

    @Test
    void shouldBeAbleToPerformSearchByGivenColors() {
        List<Car> foundCars = List.of(); // carSearch.findBy .... (EnumSet.of(WHITE, BLACK))

        assertThat(foundCars).containsExactlyInAnyOrder(FIAT_PUNTO, VW_PASSAT);
    }
}
