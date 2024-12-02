package eu.chrost.solid.sid;

import eu.chrost.solid.utils.Log;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarCheckupTest {
    private final Log log = Log.getInstance();
    private final CarService carService = new CarService();
    private final CarCheckup carCheckup = new CarCheckup(carService, carService, carService);
    private final WaxCarWash waxCarWash = new WaxCarWash();
    private final CarCheckup waxCarCheckup = new CarCheckup(carService, carService, waxCarWash);

    @AfterEach
    void cleanUp() {
        log.clearMessages();
    }

    @Test
    void shouldPerformAllNeededActionsDuringCheckup() {
        carCheckup.performCheckup();

        assertThat(log.getMessages()).containsExactly(
                "Checking oil",
                "Checking windscreen washer",
                "Checking brake fluid",
                "Vacuuming dashboard",
                "Vacuuming seats",
                "Washing body",
                "Washing windows"
        );
    }

    @Test
    public void shouldAllowWaxingDuringCheckup() {
        waxCarCheckup.performCheckup();

        assertThat(log.getMessages()).containsExactly(
                "Checking oil",
                "Checking windscreen washer",
                "Checking brake fluid",
                "Vacuuming dashboard",
                "Vacuuming seats",
                "Washing body",
                "Washing windows",
                "Waxing body"
        );
    }
}
