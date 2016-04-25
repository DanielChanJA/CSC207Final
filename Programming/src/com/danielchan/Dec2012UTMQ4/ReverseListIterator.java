package com.danielchan.Dec2012UTMQ4;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by chanj on 4/25/2016.
 */
public class ReverseListIterator<Integer> implements Iterator {

    Collection c;
    int position;

    public ReverseListIterator(Collection collection) {
        c = collection;
        position = collection.size() - 1;

    }


    @Override public boolean hasNext() {

        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override public Object next() {
        if (this.hasNext()) {
            return c.toArray()[position--];
        }
        position--;
        return null;
    }
}
