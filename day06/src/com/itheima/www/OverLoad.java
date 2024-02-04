package com.itheima.www;

import java.util.Scanner;

public class OverLoad {
    /*方法重载的要求：
    * 方法名要一致
    * 形参要有不同：1.个数不同
    *             2.类型不同
    *             3.顺序不同
    */
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        compare(a,b);
    }

    public static void compare(int a,int b) {
        if(a>b) System.out.println("较大者为："+a);
        else if (a<b) System.out.println("较大者为："+b);
        else System.out.println("两者相等");
    }
    public static void compare(float a,float b) {
        if(a>b) System.out.println("较大者为："+a);
        else if (a<b) System.out.println("较大者为："+b);
        else System.out.println("两者相等");
    }
    public static void compare(double a,double b) {
        if(a>b) System.out.println("较大者为："+a);
        else if (a<b) System.out.println("较大者为："+b);
        else System.out.println("两者相等");
    }
}
