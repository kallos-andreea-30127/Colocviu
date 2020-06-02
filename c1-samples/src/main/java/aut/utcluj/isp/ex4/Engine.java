/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp.ex4;

/**
 * @author mihai.hulea
 */
public class Engine {
    public final static int MAX_SPEED = 10;
    private boolean started;
    private int speed;

    Engine(){
        this.started=true;
        this.speed = 0;
    }
    /**
     * Start the engine
     */
    public void start() {
        this.started = true;
    }

    /**
     * Stop the engine
     */
    public void stop() {
        this.started = false;
    }

    /**
     * Increase the speed by 1 unit.
     * The current speed cannot be greater than {@link Engine#MAX_SPEED}
     */
    public void increaseSpeed() {
        if(this.speed<MAX_SPEED)
            this.speed++;

    }

    /**
     * Decrease the speed
     * The current speed cannot be lower than 0
     */
    public void decreaseSpeed() {
        if(this.speed>0)
            this.speed--;
    }

    /**
     * Get the current speed
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Check if engine is started
     *
     * @return true if started, false otherwise
     */
    public boolean isStarted() {
        return this.started;
    }
}
