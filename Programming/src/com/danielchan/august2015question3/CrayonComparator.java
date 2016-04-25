package com.danielchan.august2015question3;


import com.danielchan.Dec2012UTMQ3.Crayon;

/**
 * Created by chanj on 4/25/2016.
 */
public class CrayonComparator implements Comparator {
    @Override public int compare(Object obj1, Object obj2) {

        Crayon temp = (Crayon) obj1;
        Crayon temp2 = (Crayon) obj2;

        if (temp.getColor().compareTo(temp2.getColor()) > 0) {
            return 1;
        } else if (temp.getColor().compareTo(temp2.getColor()) < -1) {
            return -1;
        } else {
            return 0;
        }
    }
}
