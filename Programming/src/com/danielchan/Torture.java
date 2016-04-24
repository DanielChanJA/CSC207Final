package com.danielchan;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Torture {

    static class A {
        public static void doSomething(AbstractList c) {
            System.out.println("*Laughs* A");
        }

        public void doSomething(List l) {
            System.out.println("Sneaks A");
        }

        public void doSomething(Object o) {
            System.out.println("Leaps A");
        }
    }

    static class B extends A {
        public static void doSomething(AbstractList c) {
            System.out.println("*Laughs* B");
        }

        public void doSomething(ArrayList l) {
            System.out.println("Sneaks B");
        }

        public void doSomething(Object o) {
            System.out.println("Leaps B");
        }
    }

    public static void main(String[] args) {

        A a = new A();
        A ab = new B();

        B b = new B();

        ArrayList list = new ArrayList();

        a.doSomething(list);
        a.doSomething((List)list);

        a.doSomething((AbstractList)list);
        a.doSomething((Collection)list);

        ab.doSomething(list);
        ab.doSomething((List)list);

        ab.doSomething((AbstractList)list);
        ab.doSomething((Collection)list);

        b.doSomething(list);
        b.doSomething((List)list);

        b.doSomething((AbstractList)list);
        b.doSomething((Collection)list);
    }




}
