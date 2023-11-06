package com.sports.team;

public class TestPlayer {

    public static void main(String[] args) {
        Player p1 = new Player("Anton", -2);
        System.out.println(p1.introduce());

        System.out.println(p1.getName());
        System.out.println(p1.getNumber());
    }
}
