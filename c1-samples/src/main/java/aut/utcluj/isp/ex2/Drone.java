
package aut.utcluj.isp.ex2;

public class Drone {

    private String id;
    private boolean state;

    Drone(String dR1, boolean b) {
        this.id = dR1;
        this.state = b;
    }

    public String flight() {
        return "Drone " + id + " is up.";
    }


}
