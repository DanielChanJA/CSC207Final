package com.danielchan.PiazzaQuestion;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public interface Blah {

    static int a = 4;

}


class B implements Blah {

    abstract void hello();


}

class C {


    abstract void hi();

    public static void main(String[] args) {

        Blah x = new B();
        B y = new Blah();
        B z = (B) new Blah();

    }
}
