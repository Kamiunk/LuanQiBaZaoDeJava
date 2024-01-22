package com.ithe.www;

public class ArrayDemo02 {
    public static void main(String[] args) {
        String[]arr=new String[50];
        arr[0]="xiaoming";
        arr[1]="xiaohong";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//默认初始值为null
        //数组默认初始化值的规律
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'\u0000'即空格
        //布尔类型：默认初始化值false
        //引用数据类型：默认初始化值null
        int[]arr2=new int[3];

    }
}
