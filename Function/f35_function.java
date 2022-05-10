//Make a function to check if a given number n is even or not.
package com.java_code;
import java.util.*;
public class f35_function {
    public static void even(int a){
       if(a%2==0){
           System.out.println("even");
       }else{
           System.out.println("not even");
       }
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        even(x);
    }
}
