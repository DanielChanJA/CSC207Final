package com.danielchan.august2015question5;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Table implements Iterable {


    private Object[][] contents;

    @Override public Iterator iterator() {

        return new TableIterator();
    }

    class TableIterator implements Iterator {

        int xPos = 0;
        int yPos = 0;

        @Override public boolean hasNext() {
            if (contents[xPos][yPos] == null) {
                return false;
            }
        }

        @Override public Object next() {
            return null;
        }

        @Override public void remove() {

        }
    }



}
