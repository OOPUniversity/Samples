/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.functions;

/**
 * Created by jluke on 11/15/2014.
 */
public class Add {
    public static void main(String[] args) {
        int answer = add ( 2 , 3 );
        System.out.println("The answer is " + answer );
    }

    public static int add ( int number1, int number2 ) {
        return number1 + number2;
    }
}
