package eu.chrost.solid.liskov;

import eu.chrost.solid.utils.Log;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DriverTest {
    private final Log log = Log.getInstance();
    private final Driver driver = new Driver();

    @AfterEach
    void cleanUp() {
        log.clearMessages();
    }

    @Test
    void shouldDriveVehicle() {
        Vehicle vehicle = new Vehicle();

        driver.drive(vehicle);

        assertThat(log.getMessages()).containsExactly("Engine started", "Let's ride!", "Engine stopped");
    }

    @Test
    void shouldDriveTeslaVehicle() {
        TeslaVehicle teslaVehicle = new TeslaVehicle();

        driver.driveTesla(teslaVehicle);

        assertThat(log.getMessages()).containsExactly("Engine started", "Let's ride!", "Engine stopped");
    }
}
