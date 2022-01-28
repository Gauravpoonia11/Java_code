//1
//0 1
//1 0 1
//0 1 0 1
package com.java_code;
import java.util.*;
public class f19_pattern {
    public static void main(String[] args){
        int n = 4;
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        */
        //method-2
        int p,q;
        for(int i=1;i<=n;i++){
           if(i%2==0){
             p=1;q=0;
           }else{
             p=0;q=1;
           }
           for(int j=1;j<=i;j++){
              if(j%2==0){
                 System.out.print(p);
              }else{
                  System.out.print(q);
              }
           }
            System.out.println();
        }

    }
}
