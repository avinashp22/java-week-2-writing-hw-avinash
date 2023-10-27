package homeowork_week_6;
/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;


public class Programme_6_AreaOfCircle {

    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        //close the scanner object
        scanner.close();

    }

    // calculating the area of circle
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);

    }
}
