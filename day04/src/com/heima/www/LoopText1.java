package com.heima.www;

public class LoopText1 {
    /*逢七过。
      规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。*/
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%7==0||i%10==7||i/10%10==7) System.out.println('过');
            else System.out.println(i);
        }
    }
}
