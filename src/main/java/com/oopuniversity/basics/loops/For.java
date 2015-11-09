/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.loops;

/**
 * Created by jluke on 11/15/2014.
 */
public class For {

    public static void main(String [] args) {
        for1();
        for2();
        for3();
    }

    public static void for1() {
        System.out.println("for1");
        for (int runCount = 0 ; runCount < 5 ; runCount ++ ) {
            System.out.println("I am in a loop.");
        }
    }

    public static void for2() {
        System.out.println("for2");
        for ( int i = 0 ; i < 10 ; i++ ) {
            System.out.println("Loop iteration " + i );
        }
    }

    public static void for3() {
        System.out.println("for3");
        for ( int i = 0 ; i < 5 ; i++ ) {
            for ( int j = 0 ; j < 5 ; j++ ) {
                int product = i * j ;
                System.out.println (i + " X " + j + " = " + product );
            }
        }
    }
}
