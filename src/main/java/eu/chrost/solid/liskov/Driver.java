package eu.chrost.solid.liskov;

class Driver {
    public void drive(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.ride();
        vehicle.stopEngine();
    }
}
