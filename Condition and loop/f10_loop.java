// Print if a number is prime or not (Input n from the user).
package com.java_code;
import java.util.*;
public class f10_loop {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                j++;
            }
        }
        if(j==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
