package eu.chrost.solid.sid;

import eu.chrost.solid.utils.Log;

class CarService implements CarServicing {
    private final Log log = Log.getInstance();

    @Override
    public void checkLiquids() {
        checkOil();
        checkWindscreenWasher();
        checkBrakeFluid();
    }

    private void checkOil() {
        log.addMessage("Checking oil");
    }

    private void checkWindscreenWasher() {
        log.addMessage("Checking windscreen washer");
    }

    private void checkBrakeFluid() {
        log.addMessage("Checking brake fluid");
    }

    @Override
    public void vacuum() {
        vacuumDashboard();
        vacuumSeats();
    }

    private void vacuumDashboard() {
        log.addMessage("Vacuuming dashboard");
    }

    private void vacuumSeats() {
        log.addMessage("Vacuuming seats");
    }

    @Override
    public void wash() {
        washBody();
        washWindows();
    }

    private void washBody() {
        log.addMessage("Washing body");
    }

    private void washWindows() {
        log.addMessage("Washing windows");
    }
}
