//   *
//  ***
// *****
//*******
//*******
// *****
//  ***
//   *
package com.java_code;
import java.util.*;
public class f24_pattern {
    public static void main(String[] args){
        int n = 4,x =1;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            //method-2
            //for(int j=1; j<=2*i-1; j++) {
            //System.out.print("*");
            //}
            for(int j=1;j<=x;j++){            //x=1
                System.out.print("*");
            }
            x=x+2;                            //x=1+2=3
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=x-2;j++){         //x=9-2=7
                System.out.print("*");
            }
            x=x-2;                           //x=7-2=5
            System.out.println();
        }
    }
}
