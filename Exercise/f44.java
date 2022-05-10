package com.java_code;
import java.util.*;
public class f44 {
    public static void main(String ard[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int k=1;k<=a;k++)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Case #"+k+":");
            for (int i = 1; i < r*2+2; i++)
            {
                for (int j = 1; j < c*2+2; j++)
                {
                    if (i==2||i==1)
                    {
                        if(j==1||j==2)
                        {
                            System.out.print(".");
                            continue;
                        }
                    }
                    if (i%2==0)
                    {
                        if (j%2==0)
                        {
                            System.out.print(".");
                        }else{
                            System.out.print("|");
                        }
                    }else{
                        if (j%2==0)
                        {
                            System.out.print("-");
                        }else{
                            System.out.print("+");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
