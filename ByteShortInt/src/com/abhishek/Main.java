/**
 * 1. Create a byte variable and set it to any valid byte number.
 * 2. Create a short variable and set it to any valid short number.
 * 3. Create an int variable and set it to any valid int number.
 * 4. Create a variable of type long, and make it equal to
 * 50000 + 10 times the sum of the byte, plus the short plus the int
 */
package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    byte num1=101;
        short num2=10_000;
        int num3=3_040;
        long num4=50_000+10*(num1+num2+num3);
        System.out.println(num4);
    }
}
