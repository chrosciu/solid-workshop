package eu.chrost.solid.liskov;

import eu.chrost.solid.utils.Log;

abstract class AbstractVehicle {
    private final Log log = Log.getInstance();

    public void startEngine() {
        log.addMessage("Engine started");
    }

    public void ride() {
        log.addMessage("Let's ride!");
    }

    public void stopEngine() {
        log.addMessage("Engine stopped");
    }
}
