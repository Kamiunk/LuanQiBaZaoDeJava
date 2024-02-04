package com.ithematest.com;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getblood() {
        return blood;
    }

    public void setblood(int blood) {
        this.blood = blood;
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void Attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        role.setblood(Math.max(role.getblood() - hurt, 0));
        System.out.println(this.getName() + "击打了" + role.getName() + "造成" + hurt + "点伤害," + role.getName() + "还剩" + role.getblood() + "点血");
    }

}
