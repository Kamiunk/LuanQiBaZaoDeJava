package com.ithema.www;

import java.util.Scanner;

public class FashionableClothes {
    /*
    您和您的约会对象在餐厅里面正在约会
    键盘录入两个整数，表示你和你约会对象衣服的时髦度。
    (手动录入0~10之间的整数，不能录其他如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。
    */
    public static void main(String[] args) {
        int You,YourLady;
        Scanner sc=new Scanner(System.in);
        You=sc.nextInt();
        YourLady=sc.nextInt();
        System.out.println(You > YourLady);
    }
}
