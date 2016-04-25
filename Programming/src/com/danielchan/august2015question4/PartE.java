package com.danielchan.august2015question4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class PartE {

    public static int numMatches(String regex, ArrayList<String> data) {
        int count = 0;

        Pattern pattern = Pattern.compile(regex);

        for (String s : data) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                count++;
            }
        }

        return count;
    }

}
