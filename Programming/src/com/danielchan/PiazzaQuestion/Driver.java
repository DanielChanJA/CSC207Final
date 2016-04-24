package com.danielchan.PiazzaQuestion;


public class Driver {


    public static void main(String[] arg) {
        Driver driver = new Driver();
//        driver.someCalculation();
//        driver.someCalculation2();

        driver.helperFunction(5);
    }


    public void someCalculation() {

        try {
            helperFunction(5);
        } catch (RuntimeException e) {
            System.out.println("OddballException is caught");
        }

    }

    public void someCalculation2() throws RuntimeException {
        helperFunction(5);

    }


    public void helperFunction(int s) {

        if (s > 0) {

            throw new OddballException();
        }

    }

}
