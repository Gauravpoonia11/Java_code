//take two integer as input and find their nCr.
package com.java_code;
import java.util.*;
public class f31_jatin {
    public static void main(String[] args){
        System.out.println("Enter values of n and r: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int x=1,y=1,z=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }System.out.println(x);
        for(int i=1;i<=r;i++){
            y=y*i;
        }System.out.println(y);
        for(int i=1;i<=(n-r);i++){
            z=z*i;
        }System.out.println(z);
        float nCr = x/(n-r);
        System.out.println("nCr is "+nCr);
    }
}
