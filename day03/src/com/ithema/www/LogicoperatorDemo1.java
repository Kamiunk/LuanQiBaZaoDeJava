package com.ithema.www;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //^异或
        //相同为false，不同为true
        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(true^false);
        System.out.println(false^true);
        //短路与&&
        //运行结果和&一样
        System.out.println(true&&false);
        System.out.println(true&false);
        System.out.println(true&&true);
        System.out.println(true&true);
        //短路或||
        //运行结果和|一样
        System.out.println(true||false);
        System.out.println(true|false);
        System.out.println(true||true);
        System.out.println(true|true);
        //短路运算符有短路的效果
        //当左边的表达式能确定最终的结果，那么右边的就不参加运行了
        //数字的逻辑与和逻辑或就是没有短路的

    }
}
