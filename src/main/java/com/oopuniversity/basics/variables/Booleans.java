/*
 * Copyright (c) 2014.
 */

package main.java.com.oopuniversity.basics.variables;

/**
 *
 * Blog post 8, Hooray for Boo..leans
 * Created by jluke on 11/15/2014.
 */
public class Booleans {
    static int yearsAsCustomer = 1;
    static int totalOrders = 1000;
    static int discountPercent = 0;

    public static void main(String [] args) {
        booleans1();

        yearsAsCustomer = 6;
        booleans2();
        totalOrders = 1001;
        booleans2();

        booleans3();

        booleans4();

        booleans5();

        booleans6();
    }

    public  static void booleans6() {
        System.out.println("booleans6");

        boolean isACustomer = false;
        int years = 5;
        int sales = 900;
        boolean runningSpecialIncentives = true;

        boolean meetsQuotas = years > 10 || (years > 5 && sales > 1000);

        if ( ! meetsQuotas && runningSpecialIncentives ) {
            System.out.println("We're giving a discount due to the special incentives program, but this guy is a cheapskate.");
        }
        if ((isACustomer && meetsQuotas) || runningSpecialIncentives) {
            System.out.println("Incentive applied.");
        }
        else {
            System.out.println("No incentives.");
        }
    }

    public  static void booleans5() {
        System.out.println("booleans5");

        boolean isACustomer = false;
        int years = 5;
        int sales = 900;
        boolean runningSpecialIncentives = false;

        boolean meetsQuotas = years > 10 || (years > 5 && sales > 1000);

        if ((isACustomer && meetsQuotas) || runningSpecialIncentives) {
            System.out.println("Incentive applied.");
        }
        else {
            System.out.println("No incentives.");
        }
    }

    public  static void booleans4() {
        System.out.println("booleans4");

        boolean isACustomer = false;
        int years = 5;
        int sales = 900;
        boolean runningSpecialIncentives = false;

        if ((isACustomer && (years > 10 || (years > 5 && sales > 1000))) || runningSpecialIncentives) {
            System.out.println("Incentive applied.");
        }
        else {
            System.out.println("No incentives.");
        }
    }

    public static void booleans3() {
        System.out.println("booleans3");
        if ((5==5) == (true == true)) {
            System.out.println("Imagine that");
        }

    }

    public static void booleans2() {
        System.out.println("booleans2");
        if ( yearsAsCustomer > 5 && totalOrders > 1000 ) {
            discountPercent = 1;
        }
        System.out.println("Discount is " + discountPercent + "%");

    }

    public static void booleans1() {

        System.out.println("booleans1");
        if ( yearsAsCustomer > 5 ) {
            if ( totalOrders > 1000 ) {
                discountPercent = 1;
            }
        }

        System.out.println("Discount is " + discountPercent + "%");
    }


}
