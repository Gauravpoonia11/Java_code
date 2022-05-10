//Print all even numbers till n.
package com.java_code;
import java.util.*;
public class f6_loop {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while(i<x){
            if(i%2==0)
                System.out.println(i);
            i++;
        }
    }
}
