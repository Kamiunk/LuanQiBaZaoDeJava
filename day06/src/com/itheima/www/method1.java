package com.itheima.www;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {

        System.out.println("计算结果为："+AddMethod());
    }

    public static int AddMethod() {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("请输入第一个整数：");
        a=sc.nextInt();
        System.out.print("请输入第二个整数：");
        b=sc.nextInt();
        return a+b;
    }
}
