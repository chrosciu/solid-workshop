package eu.chrost.solid.sid;

import eu.chrost.solid.utils.Log;

class WaxCarWash {
    private final Log log = Log.getInstance();
    
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
