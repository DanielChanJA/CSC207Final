package com.danielchan.august2015question5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Table implements Iterable {


    private Object[][] contents;
    private int maxXPos, maxYPos;

    public Table(Object[][] c) {
        contents = c;
        maxYPos = contents[0].length;
        maxXPos = contents.length;

    }

    @Override
    public Iterator iterator() {

        return new TableIterator();
    }

    class TableIterator implements Iterator {

        int xPos = 0;
        int yPos = 0;


        @Override
        public boolean hasNext() {
            if (xPos <= maxXPos && yPos <= maxYPos) {
                return true;
            } else {
                return false;
            }
        }


        @Override
        public Object next() {
            if (this.hasNext() && yPos <= maxYPos) {
                return contents[xPos][yPos++];
            } else if (this.hasNext() && yPos > maxYPos) {
                yPos = 0;
                xPos++;
                return contents[xPos][yPos];
            }
            return null;
        }

        @Override
        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }
    }



}
