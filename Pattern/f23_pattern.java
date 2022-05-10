//*      *
//**    **
//***  ***
//********
//********
//***  ***
//**    **
//*      *
package com.java_code;
import java.util.*;
public class f23_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        //    for(int spc=2*(n-i);spc>=1;spc=spc-2){
        //        System.out.print(" ");
        //    }
            int spc=2*(n-i);
            while(spc>=1) {
                System.out.print(" ");
                spc--;
            }
            //   spc=spc-2;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        //    int spaces = 2 * (n-i);
        //    for(int j=1; j<=spaces; j++) {
        //        System.out.print(" ");
        //    }
            int spc=2*(n-i);
            while(spc>=1){
                System.out.print(" ");
                spc--;
            }
         //   spc=spc-2;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
