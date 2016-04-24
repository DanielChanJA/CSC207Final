package com.danielchan.august2015question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class DateTest {

    public static void main(String[] args) {
        Date d1 = new Date(1, 21, 2000);
        Date d2 = new Date(4, 30, 2000);
        Date d3 = new Date(1, 21, 2012);
        Date d4 = new Date(11, 21, 1999);
        Date d5 = new Date(12, 12, 2000);

        List<Date> dateList = new ArrayList<>();
        dateList.add(d1);
        dateList.add(d2);
        dateList.add(d3);
        dateList.add(d4);
        dateList.add(d5);


        Collections.sort(dateList, new Date.Comparators());

        System.out.println("Sorted List: " + dateList);

    }
}
