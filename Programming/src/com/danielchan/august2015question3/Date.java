package com.danielchan.august2015question3;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Date {

    public int month;
    public int day;
    public int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    @Override public String toString() {
        return month + "/" + day + "/" + year;
    }


    static class Comparators implements Comparator<Date> {

        @Override public int compare(Date obj1, Date obj2) {
            if (obj1.year > obj2.year) {
                return 1;
            } else if (obj1.year < obj2.year) {
                return -1;
            } else {
                if (obj1.month > obj2.month) {
                    return 1;
                } else if (obj1.month < obj2.month) {
                    return -1;
                } else {
                    if (obj1.day > obj2.day) {
                        return 1;
                    } else if (obj1.day < obj2.day) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }

}
