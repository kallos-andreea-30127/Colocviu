/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex5;

/**
 *
 * @author mihai.hulea
 */
public class Drone implements Operations {
    private String id;
    private boolean started;
    private int altitude;

    Drone() {
        this.id = "D0";
        this.started = true;
        this.altitude = 0;
    }

    public void goUp(){
      this.altitude++;
    }

    public void goDown(){
        this.altitude--;
    }
}
