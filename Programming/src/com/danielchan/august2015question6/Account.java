package com.danielchan.august2015question6;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Account extends Observable implements Observer {

    private String accountName;
    private int numTweets = 0;

    public Account(String name) {
        accountName = name;
    }

    public void follows(Account account) {
        account.addObserver(this);
    }

    public void tweet(String s) {
        numTweets++;
        this.setChanged();
        notifyObservers(s);
        this.clearChanged();
    }


    @Override public void update(Observable o, Object arg) {

        System.out.println(this.accountName + " (" + numTweets + " tweets) "
            + "found out that " + ((Account) o).accountName + " ("
            + ((Account) o).numTweets + " tweets) " + " tweeted '" + arg + "'");

    }
}
