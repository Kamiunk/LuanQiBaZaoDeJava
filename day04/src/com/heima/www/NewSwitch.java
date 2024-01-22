package com.heima.www;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println('一');
            }
            case 2 -> {
                System.out.println('二');
            }
            case 3 -> {
                System.out.println('三');
            }
            default -> {
                System.out.println("无此选项");
            }
        }
    }
}
