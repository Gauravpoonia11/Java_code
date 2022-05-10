//Enter 3 numbers from the user and make a function to print their average.
package com.java_code;
import java.util.*;
public class f37_exercise {
    public static void avg(int a,int b,int c){
        int av = (a+b+c)/3;
        System.out.println(av);
    }
    public static void main(String[] args){
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg(a,b,c);
    }
}
