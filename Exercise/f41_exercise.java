//write a function that takes in age as input and returns if that person is
//eligible to vote or not.A person of age>18 is eligible to vote.
package com.java_code;
import java.util.*;
public class f41_exercise {
    public static void vote(int age){
        if(age>18){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("Sorry you are not eligible to vote.");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        vote(a);
    }

}
