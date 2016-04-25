package com.danielchan.Dec2012UTMQuestion6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chanj on 4/25/2016.
 */
public class CounterTest {

    Counter counter;

    @Before public void setUp() throws Exception {
        counter = new Counter();
    }

    @Test public void testIncrement() throws Exception {
        counter.increment();

        assertTrue(counter.getCount() == 1);
    }

    @Test public void testDecrement() throws Exception {

        counter.decrement();

        assertTrue(counter.getCount() == -1);
    }

    @Test public void testOverLimitException() {
        try {
            counter.increment();
            counter.increment();
            counter.increment();
            counter.increment();
            fail("Did not throw error.");
        } catch (Exception e) {

        }
    }

    @Test public void testUnderLimitException() throws Exception {
        try {
            counter.decrement();
            counter.decrement();
            counter.decrement();
            counter.decrement();
            fail("Did not throw error.");
        } catch (Exception e) {

        }
    }

}
