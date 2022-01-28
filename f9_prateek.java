//write a program to check that a given digit is present in a number or not.
package com.java_code;
import java.util.*;
public class f9_prateek {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x=a;
        int ar[]=new int[100];
        int i=0;
        while(i>=0){
            if(x==0){
                break;
            }
            ar[i]=x%10;
            x=x/10;
            i++;
        }
        System.out.println("Digit: ");
        int  b = sc.nextInt();
        int j=0;
        for(i=0;i< ar.length;i++){
            if(ar[i]==b){
                System.out.println(b+" is present in "+a);
                j++;
            }
        }
        if(j==0){
            System.out.println(b+" is not present in "+a);
        }
    }
}
