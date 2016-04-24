package com.danielchan;

/**
 * Created by chanj on 4/17/2016.
 */
public class Bicycle extends Cycle{
    public int getNumWheels() {
        return 2;
    }

    public void roll() {
        System.out.println("Rolling");
    }
}
