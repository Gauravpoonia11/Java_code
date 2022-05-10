// Make a program that prints the table of a number that is input by
// the user.
package com.java_code;
import java.util.*;
public class f3_basic {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a*i);
        }
    }
}
