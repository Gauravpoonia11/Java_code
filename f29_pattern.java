//Print Inverted Half Pyramid.
//1111
//222
//33
//4
package com.java_code;
import java.util.*;
public class f29_pattern {
    public static void main(String[] args){
        int n = 4;
        int a =n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print(i);
            }
            System.out.println();
            a--;
        }
    }
}
