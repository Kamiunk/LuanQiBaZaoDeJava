package com.itheima.demo02;

import java.util.Scanner;

public class NumericSplitting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt(),b=1, a=i,e=i;
        while (i>9){
            i/=10;
            if(i==0)break;
            else b++;
        }
        for (int j=0;j<b;j++){
            for(i=0;i<j;i++){
                a/=10;
            }
            a%=10;
            System.out.println(a);
            a=e;
        }
    }
}
