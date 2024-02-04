package com.ithematest.com;

public class GameTest {
    public static void main(String[] args) {
        Role c1 = new Role("小明", 100);
        Role c2 = new Role("李华", 100);
        while (true) {

            c1.Attack(c2);
            if (c2.getblood() == 0) {
                System.out.println(c1.getName() + "赢了");
                break;
            }
            c2.Attack(c1);
            if (c1.getblood() == 0) {
                System.out.println(c2.getName() + "赢了");
                break;
            }
        }
    }

}
