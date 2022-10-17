package com.bridgelabz;

//  Use Java Object Oriented Programming Concepts of Line and Point as well as equals and compareTo methods.
//  Using Java compareTo method to compare 2 Lengths is preferable.

import java.util.Scanner;

public class OopsUC4 {
    public static Integer x1 = 9;
    public static Integer y1 = 5;
    public static Integer x2 = 6;
    public static Integer y2 = 9;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        lineLength();
    }
    public static void lineLength() {
        System.out.println("Enter Integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num) {
            case 1:
                double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
                System.out.println("Length of Line is: " + lengthOfLine);
                break;
            case 2:
                equality();
                break;
            case 3:
                compare();
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
    public static void equality() {

        boolean result1 = x1.equals(y1);
        System.out.println("Result of equals()="+result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result of equals()="+result2);

    }
    public static void compare() {

        int compareLength1 = Integer.compare(x1,y1);
        System.out.println("Result of compare(x1,y1)is:"+ compareLength1);
        int compareLength2 = Integer.compare(x2,y2);
        System.out.println("Result of compare(x2,y2)is:"+ compareLength2);
    }
}
