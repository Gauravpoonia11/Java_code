//1234
//123
//12
//1
package com.java_code;
import java.util.*;
public class f17_pattern {
    public static void main(String[] args){
        int n = 4;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
