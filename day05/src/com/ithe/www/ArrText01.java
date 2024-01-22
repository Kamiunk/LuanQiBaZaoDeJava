package com.ithe.www;

import java.util.Random;

public class ArrText01 {
    /*需求：随机生成10个1~100的整数存入数组
     * 求出所有数据的和
     * 求出所有数据的平均数
     * 统计有多少个数据比平均数小*/
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
        }
        /*
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ｝
        */
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        /*
            20~22行等同于以下注释：
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
                ｝
        */
        System.out.println("10个数的和为" + sum);
        double Average = (double) sum / 10;
        System.out.println("10个数的平均数为" + Average);
        int count = 0;
        for (int j : arr) {
            if (j > Average) count++;
        }
        System.out.println("一共有" + count + "个数据大于平均数");
    }
}
