package com.danielchan.Dec2012UTMQuestion6;

/**
 * Created by chanj on 4/25/2016.
 */
public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public int increment() throws OverLimitException {
        if (count > 2) {
            throw new OverLimitException("Greater than 2 limit");
        }

        return ++count;
    }

    public int decrement() throws UnderLimitException {
        if (count < -2) {
            throw new UnderLimitException("Less than 2 limit");
        }

        return --count;
    }

    public int getCount() {
        return count;
    }

}
