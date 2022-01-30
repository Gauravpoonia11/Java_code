//Write a function to calculate the factorial of a number.
package com.java_code;
import java.util.*;
public class f33_function {
    public static void fac(int a){
        int x=1;
        for(int i=1;i<=a;i++){
            x=x*i;
        }
        System.out.println(x);
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        fac(b);
    }
}
