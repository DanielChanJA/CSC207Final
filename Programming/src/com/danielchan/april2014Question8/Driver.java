package com.danielchan.april2014Question8;

/**
 * Created by chanj on 4/24/2016.
 */
public class Driver {

    public static void main(String[] args) {

        NumberList numbers = new NumberList(50);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        for (Number n1 : numbers) {
            for (Number n2 : numbers) {
                System.out.println("" + n1 + n2);
            }
        }
    }


}
