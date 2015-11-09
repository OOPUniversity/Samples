/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.loops;

/**
 * Created by jluke on 11/15/2014.
 */
public class DoWhile {
    public static void main(String[] args) {
        doWhile1();

        doWhile2();

        doWhile3();
    }

    public static void doWhile1() {
        System.out.println("doWhile1");
        boolean keepRunning = true;

        do {
            System.out.println("I am in a loop.");
            keepRunning = false;
        } while ( keepRunning );
    }

    public static void doWhile2() {
        System.out.println("doWhile2");
        boolean keepRunning = false;

        System.out.println("About to enter loop.");
        while ( keepRunning ) {
            System.out.println("I am in a loop.");
        }
        System.out.println("Done with loop.");

    }

    public static void doWhile3() {
        System.out.println("doWhile3");
        boolean keepRunning = false;

        System.out.println("About to enter loop.");
        do {
            System.out.println("I am in a loop.");
        } while ( keepRunning );
        System.out.println("Done with loop.");
    }
}
