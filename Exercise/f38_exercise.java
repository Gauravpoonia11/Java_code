//write a function to print the sum of all odd numbers from 1 to n.
package com.java_code;
import java.util.*;
public class f38_exercise {
    public static void sum(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        sum(x);
    }
}
