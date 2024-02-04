package com.itheima.www;

import java.util.Scanner;

public class AmountConversion {
    public static void main(String[] args) {
        int amount;
        String result1="";
        while (true) {
            Scanner sc=new Scanner(System.in);
            amount=sc.nextInt();
            if(amount>=0&&amount<=9999999){
                break;
            }
            else{
                System.out.println("输入金额有误，请重新输入");
            }
        }
        do {
            int ge = amount % 10;
            result1 =  LowercaseToUppercase(ge)+result1 ;
            amount /= 10;
        } while (amount != 0);
        int count=7 - result1.length();
        for (int i = 0; i <count; i++) {
            result1="零"+result1;
        }
        System.out.println(result1);
        System.out.println(UnitInsertionSplicing(result1));
    }
    public static String LowercaseToUppercase(int num){
        String[]arr1={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr1[num];
    }
    public static String UnitInsertionSplicing(String result1){
        String[]arr2={"佰","拾","万","仟","佰","拾","元"};
        String result2="";
        for (int i = 0; i < 7 - result1.length(); i++) {
            result1="零"+result1;
        }
        for (int i = 0; i < 7; i++) {
            char c=result1.charAt(i);
            result2=result2+c+arr2[i];
        }
        return result2;
    }
}
