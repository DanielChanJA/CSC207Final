package com.danielchan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Daniel Chan on 22/4/16.
 */
public class ProblemSetApril8 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("asdasd");

        System.out.println(matcher.find());

    }




}
