//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4
package com.java_code;
import java.util.*;
public class f22_pattern {
    public static void main(String[] args){
        int n = 4,a = 1;
        for(int i=1;i<=n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){    //use for(int i=1;j<=i;j++) for diff pattern
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
