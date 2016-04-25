package com.danielchan.Dec2012UTMQ4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by chanj on 4/25/2016.
 */
public class ReverseListTest {

    public static void main(String[] args) {

        int maxSize = 20;

        List<Integer> numberArray = new ArrayList<Integer>();
        List<Integer> numberStack = new Stack<Integer>();

        for(int i =0; i < maxSize; i++) {
            numberArray.add(new Integer(i));
            numberStack.add(new Integer(i));
        }

        Iterator<Integer> fwdArrayIterator = numberArray.iterator();
        System.out.println("Iterating forward through the array list:");
        while (fwdArrayIterator.hasNext()) {
            System.out.println(fwdArrayIterator.next());
        }

        Iterator<Integer> reverseListIterator =
            new ReverseListIterator<Integer>(numberArray);
        System.out.println("Iterating backward through the array list:");
        while (reverseListIterator.hasNext()) {
            System.out.println(reverseListIterator.next());
        }

        Iterator<Integer> fwdStackIterator = numberStack.iterator();
        System.out.println("Iterating forward through the stack list:");
        while (fwdStackIterator.hasNext()) {
            System.out.println(fwdStackIterator.next());
        }

        reverseListIterator = new ReverseListIterator<Integer>(numberStack);
        System.out.println("Iterating backward through the stack list:");
        while (reverseListIterator.hasNext()) {
            System.out.println(reverseListIterator.next());
        }
    }

}
