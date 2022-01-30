//Print Pascal’s Triangle.
//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1
package com.java_code;
import java.util.*;
public class f27_pattern {
    public static void main(String[] args){
        int n = 6,x = 1;
        for(int i=0;i<n;i++){
            for(int spc=1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||i==0){
                    System.out.print(x+" ");
                }else{
                    x=x*(i-j+1)/j;
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}
