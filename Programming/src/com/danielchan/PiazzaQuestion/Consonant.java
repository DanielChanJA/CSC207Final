package com.danielchan.PiazzaQuestion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Consonant {

    public static String swapAround(String s) {

        Pattern pattern = Pattern.compile("[a-zA-Z&&[^aeiouAEIOU]]+");
        Matcher matcher = pattern.matcher(s);

        if(matcher.find()) {

            s = s + matcher.group(0);
            s = s.replaceFirst(matcher.group(0), "");

        }
        return s;
    }


    public static void main(String[] arg) {

        System.out.println(swapAround("string"));

    }


}
