/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.loops;

/**
 * Created by jluke on 11/15/2014.
 */
public class While {

    public static void main(String [] args) {
        while1();

        while2();

        while3();
    }

    public static void while1() {
        System.out.println("While loop 1");
        boolean keepRunning = true;

        while ( keepRunning )  {
            System.out.println("I am in a loop.");
            keepRunning = false;
        }
        System.out.println("I am no longer in a loop.");
    }

    public static void while2() {
        System.out.println("While loop 2");
        boolean keepRunning = true;
        int runCount = 0;

        while ( keepRunning ) {
            System.out.println("I am in a loop.");
            runCount = runCount + 1;
            if ( runCount > 4 )  {
                keepRunning = false;
            }
        }
    }

    public static void while3() {

        System.out.println("While loop 3");
        int runCount = 0;

        while ( runCount < 5 ) {
            System.out.println("I am in a loop.");
            runCount ++;
        }

    }
}
