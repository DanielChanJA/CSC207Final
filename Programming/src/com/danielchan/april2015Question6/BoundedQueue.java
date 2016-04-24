package com.danielchan.april2015Question6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Daniel Chan on 23/4/16.
 */
public class BoundedQueue<T> implements Iterable<T> {


    private Object[] queue;
    private int currentLoad = 0;

    public BoundedQueue(int capacity) {

        queue = new Object[capacity];

    }

    public BoundedQueue(int capacity, List<T> items) {

        if (items.size() <= capacity) {

            queue = new Object[capacity];

            int count = 0;

            for (Object item : items) {

                queue[count] = item;
                count++;

            }

            currentLoad = currentLoad + count;

        }

    }

    public void addItem(Object item) throws QueueFullException {

        if (currentLoad < queue.length) {
            this.queue[currentLoad] = item;
            currentLoad++;
        } else {
            throw new QueueFullException();
        }

    }


    public Object peekHead() {

        if (this.queue.length > 0 && this.queue[0] != null) {
            return this.queue[0];
        } else {
            return null;
        }

    }

    public Object popHead() throws NoSuchElementException {

        if (this.queue.length > 0 && this.queue[0] != null) {
            Object temp = this.queue[0];
            queue = Arrays.copyOfRange(this.queue, 1, this.queue.length-1);
            this.currentLoad--;
            return temp;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override public Iterator iterator() {
        return Arrays.asList(queue).iterator();
    }

    @Override public String toString() {

        String out = "";

        for (Object o : queue) {
            if (o != null) {
                out = out + o.toString();
            }
        }

        return out;

    }


}
