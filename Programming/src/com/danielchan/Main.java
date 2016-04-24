package com.danielchan;

public class Main {

    public static void main(String[] args) {
        Car asdcar = new Car();
        asdcar.move();

        Vehicle car = new Car();
        ((Car) car).getNumWheels();

        Wheeled carasd = new Bicycle();
        carasd.getNumWheels();

        Vehicle vehicle = new MotorizedVehicle();

        MotorizedVehicle motorBoat = new Boat(27);

        Cycle myRide = new Bicycle();
        ((Wheeled) myRide).getNumWheels();

    }
}
