package eu.chrost.solid.sid;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class CarCheckup {
    private final CarServicing carServicing;

    public void performCheckup() {
        carServicing.checkLiquids();
        carServicing.vacuum();
        carServicing.wash();
    }
}
