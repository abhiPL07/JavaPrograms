/**
 * 1. Create a double variable with the value 20
 * 2. Create a second variable of type double with the value 80
 * 3. Add both numbers up and multiply by 25
 * 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
 * 5. Write an "if" statement that displays a message "Total was over the limit"
 * if the remaining total (#4) is equal to 20 or less.
 */
package com.abhishek;

public class Main {

    public static void main(String[] args) {
	double n1=20, n2=80;
    double n3=(n1+n2)*25;
    double rem=n3%40;
    if(rem<=20)
        System.out.println("Total was over the limit");
    }
}
