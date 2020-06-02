/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex4;

/**
 * @author mihai.hulea
 */
public class Drone {

    private Engine engine;
    private int altitude;

    Drone (){
        this.engine = new Engine();
        this.altitude = 0;
    }

    /**
     * Drone can work only with an engine.
     * Move the drone up. Each time this method will be invoked, the altitude will be incremented by 1 unit
     */
    public void goUp() {
        engine.start();
        this.altitude++;
    }

    /**
     * Move the drone down. Each time this method will be invoked, the altitude will be decremented by 1 unit
     * Altitude should not be negative. If negative altitude is reached, an {@link NegativeAltitudeException} exception
     * will be thrown
     */
    public void goDown() {
        if(this.altitude == 0)
            throw new NegativeAltitudeException();
        else this.altitude--;
    }

    /**
     * Get current altitude
     *
     * @return the current altitude
     */
    public int getAltitude() {
        return this.altitude;
    }

    /**
     * Start the engine
     */
    public void startEngine() {
        this.engine.start();
    }

    /**
     * Get the current engine
     *
     * @return instance of {@link Engine}
     */
    public Engine hasEngine() {
        return engine;
    }
}
