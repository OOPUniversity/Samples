/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.conditionals;

/**
 * Created by jluke on 12/2/2014.
 */
public class IfDemo {

    public static void main(String[] args) {
        IfDemo ifDemo = new IfDemo();


    }

    void trueDemo() {
        if (true) {
            System.out.println("Condition was true.");
        }
    }

    void falseDemo() {
        if (false) {
            System.out.println("Condition was false.");
        }
    }

    void ifElseDemo() {


        boolean condition = true;

        if (condition == true) {
            System.out.println("Condition was true.");
        }
        else {
            System.out.println("Condition was false.");
        }

        condition = false;

        if (condition == false) {
            System.out.println("Condition was true.");
        }
        else {
            System.out.println("Condition was false.");
        }
    }
}
