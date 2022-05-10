//write a function that takes in the radius as input and returns the circumference of circle.
package com.java_code;
import java.util.*;
public class f40_exercise {
    public static double cir(int r){
        double x = 2*3.14*r;
        return x;
    }
    public static void main(String[] args){
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(cir(a));
    }
}
