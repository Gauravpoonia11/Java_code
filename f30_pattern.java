//      1
//    1 2 1
//  1 2 3 2 1
//1 2 3 4 3 2 1
package com.java_code;
import java.util.*;
public class f30_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}