//   *
//  **
// ***
//****
package com.java_code;
import java.util.*;
public class f15_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
