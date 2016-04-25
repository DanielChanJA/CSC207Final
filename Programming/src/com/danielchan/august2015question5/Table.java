package com.danielchan.august2015question5;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Table implements Iterable {


    private Object[][] contents;

    @Override public Iterator iterator() {

        return null;
    }

    class TableIterator implements Iterator {
        @Override public boolean hasNext() {
            return false;
        }

        @Override public Object next() {
            return null;
        }

        @Override public void remove() {

        }
    }



}
