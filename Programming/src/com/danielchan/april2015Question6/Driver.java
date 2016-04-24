package com.danielchan.april2015Question6;

import java.util.Arrays;

/**
 * Created by Daniel Chan on 23/4/16.
 */
public class Driver {

    public static void main(String[] args) {

        BoundedQueue<String> queueOne = new BoundedQueue<String>(3);

        Integer[] myArray = new Integer[] {1, 2, 3, 4};
        BoundedQueue<Integer> queueTwo =
            new BoundedQueue<Integer>(5, Arrays.asList(myArray));

        try {

            queueOne.addItem("How");
            queueOne.addItem("are");
            queueOne.addItem("you");
            queueOne.addItem("today?");


        } catch (QueueFullException e) {
            System.out.println("The queue is full");
        }

        for (String s : queueOne) {
            System.out.println(s);
        }

        queueTwo.popHead();

        System.out.println(queueTwo.peekHead());

        for (Integer i : queueTwo) {
            System.out.println(i);
        }


    }


}
