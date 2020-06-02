/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex2;

/**
 * @author mihai.hulea
 */
public class StealthDrone  {

    private Drone drone;
    private String destination;

    StealthDrone(String sdR1, boolean b, String cluj) {
        this.drone = new Drone(sdR1,b);
        this.destination=cluj;
    }

    String flight() {
        return "Stealth " + drone.flight();
    }
}
