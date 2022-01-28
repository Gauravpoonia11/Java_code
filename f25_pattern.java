//hollow butterfly
//*      *
//**    **
//* *  * *
//*  **  *
//*  **  *
//* *  * *
//**    **
//*      *
package com.java_code;
import java.util.*;
public class f25_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
