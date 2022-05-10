//write a function which takes 2 numbers and returns the greater of those two.
package com.java_code;
import java.util.*;
public class f39_exercise {
    public static int greater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(greater(x,y));
    }
}
