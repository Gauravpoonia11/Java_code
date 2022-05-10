//Make a function to check if a number is prime or not.
package com.java_code;
import java.util.*;
public class f34_function {
    public static void prime(int a){
        int x=1;
        for(int i=2;i<a;i++){
            if(a%i==0){
                x++;
            }
        }
        if(x==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        prime(d);
    }
}
