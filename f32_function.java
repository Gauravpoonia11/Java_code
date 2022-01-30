//write function to multiply two number.
package com.java_code;
import java.util.*;
public class f32_function {
    public static void mul(int a,int b){
      int m=a*b;
      System.out.println(m);
    }
    public static void main(String[] args){
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mul(a,b);
    }
}
