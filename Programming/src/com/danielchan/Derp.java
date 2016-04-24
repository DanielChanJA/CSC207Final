package com.danielchan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Daniel Chan on 24/4/16.
 */
public class Derp {

    static class A {
        public static void saySomething() {
            System.out.println("Hello!");
        }

        public void doSomething(List l) {
            System.out.println("*Jumps!*");
        }

        public void doSomething(Collection c) {
            System.out.println("*Laughs!*");
        }
    }


    static class B extends A {
        public static void saySomething() {
            System.out.println("Nihao!");
        }

        public void doSomething(Collection c) {
            System.out.println("*Leans*");
        }

                public void doSomething(List l) {
                    super.doSomething((Collection)l);
                }
            }


        public static void main(String[] args) {

            A a = new A();
            A ab = new B();

            B b = new B();

            List list = new ArrayList();
            Collection c = new ArrayList();

            a.saySomething();
            ab.saySomething();
            b.saySomething();

            a.doSomething(list);
            a.doSomething(c);

            b.doSomething(list);
            b.doSomething(c);

            ab.doSomething(list);
            ab.doSomething(c);


        }



    }
