//Make a function to print the table of a given number n.
package com.java_code;
import java.util.*;
public class f36_function {
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        table(a);
    }
}
