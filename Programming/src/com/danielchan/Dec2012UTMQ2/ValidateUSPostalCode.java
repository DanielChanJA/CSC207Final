package com.danielchan.Dec2012UTMQ2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chanj on 4/25/2016.
 */
public class ValidateUSPostalCode {

    public static void main(String[] args) {
        String worldAddress1 = "12 SomeStreet Apt 999 City GA 12345-6789 USA";
        String worldAddress2 = "12 SomeStreet Apt 999 City ON 12333 CANADA";

        Pattern pattern = Pattern.compile("(\\d{5}-\\d{4})|(\\d{5})");
        Matcher matcher = pattern.matcher(worldAddress1);
        Matcher matcher2 = pattern.matcher(worldAddress2);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        if (matcher2.find()) {
            System.out.println(matcher2.group(0));
        }
    }


}
