
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        int length, width, area;
        String strLength, strWidth;

        double convert = 0.09290304;
        double imp_area;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        strLength = sc.nextLine();

        System.out.print("What is the width of the room in feet? ");
        strWidth =sc.nextLine();

        length = Integer.parseInt(strLength);
        width = Integer.parseInt(strWidth);

        area = length * width;
        imp_area = area * convert;

        System.out.print("You entered dimensions of " + length +  " feet by " + width + " feet.\n" + "The area is\n" + area + " square feet\n");
        System.out.printf("%.3f square meters" , imp_area);
    }
}
