package com.danielchan.Dec2012UTMQ3;

import com.danielchan.august2015question3.CrayonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by chanj on 4/25/2016.
 */
public class ComparatorTest {

    public static void main(String[] args) {

        Crayon crayon1 = new Crayon();
        Crayon crayon2 = new Crayon();
        Crayon crayon3 = new Crayon();
        Crayon crayon4 = new Crayon();

        crayon1.setColor("green");
        crayon2.setColor("red");
        crayon3.setColor("blue");
        crayon4.setColor("purple");

        List cList = new ArrayList();
        cList.add(crayon1);
        cList.add(crayon2);
        cList.add(crayon3);
        cList.add(crayon4);

        System.out.println(cList);

        Collections.sort(cList, new CrayonComparator());

        System.out.println(cList);


    }
}
