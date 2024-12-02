package eu.chrost.solid.sid;

import eu.chrost.solid.utils.Log;

class WaxCarWash implements CarWashing {
    private final Log log = Log.getInstance();
    
    @Override
    public void wash() {
        washBody();
        washWindows();
        waxBody();
    }

    private void washBody() {
        log.addMessage("Washing body");
    }

    private void washWindows() {
        log.addMessage("Washing windows");
    }

    private void waxBody() {
        log.addMessage("Waxing body");
    }
}
