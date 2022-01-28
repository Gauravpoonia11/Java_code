//1
//2 3
//4 5 6
//7 8 9 10
package com.java_code;
import java.util.*;
public class f18_pattern {
    public static void main(String[] args){
        int n = 4,m = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
    }
}
