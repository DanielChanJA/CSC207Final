package com.danielchan.august2015question6;

import java.util.HashMap;
import java.util.NoSuchElementException;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class AccountList {

    private HashMap<String, Account> list;

    public AccountList() {
        this.list = new HashMap<String, Account>();
    }

    public Account createAccount(String username) throws
        UsernameUnavailableException{
        if (list.containsKey(username)) {
            throw new UsernameUnavailableException();
        } else {
            Account a = new Account(username);
            list.put(username, a);
            return a;
        }
    }

    public void recordFollows(String s1, String s2) throws
        NoSuchUsernameException{

        Account a1 = this.list.get(s1);
        Account a2 = this.list.get(s2);

        if (a1 == null || a2 == null) {
            throw new NoSuchUsernameException();
        } else {
            a1.follows(a2);
        }

    }
}
