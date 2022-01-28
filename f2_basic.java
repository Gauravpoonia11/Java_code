// Make a program that takes the radius of a circle as input, calculates
// its area and prints it as output to the user.
package com.java_code;
import java.util.*;
public class f2_basic {
    public static void main(String args[]){
        System.out.println("Enter the radius of a circle: ");
        Scanner sc = new  Scanner(System.in);
        float r = sc.nextFloat();
        double area = 3.14*(r*r);
        System.out.println(area);
    }
}