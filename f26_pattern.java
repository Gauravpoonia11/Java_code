//Print a hollow Rhombus.
//    *****
//   *   *
//  *   *
// *   *
//*****
package com.java_code;
import java.util.*;
public class f26_pattern {
    public static void main(String[] args){
        int n = 4,m = 5;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                if(i==1||j==1||j==m||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
