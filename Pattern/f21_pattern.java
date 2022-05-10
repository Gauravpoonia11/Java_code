//   1
//  2 2
// 3 3 3
//4 4 4 4
package com.java_code;
import java.util.*;
public class f21_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
