package com.danielchan.april2014Question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by chanj on 4/24/2016.
 */
public class NumberList implements Iterable<Number> {

    private int numItems;
    private Number[] numbers;

    public NumberList(int size) {
        this.numbers = new Number[size];
        this.numItems = 0;
    }

    public void add(Number number) {
        this.numbers[this.numItems++] = number;
    }

    @Override
    public Iterator<Number> iterator() {

        Number[] temp = Arrays.copyOfRange(numbers, 0, numItems);

        return Arrays.asList(temp).iterator();
    }

}
