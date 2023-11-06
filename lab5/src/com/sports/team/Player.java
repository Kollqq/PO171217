package com.sports.team;

public class Player {
    private String name;
    private int number;

    public Player(String name, int number){
        this.name = name;
        if (number >= 0){
            this.number = number;
        }
        else {
            this.number = 10;
        }
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
       return number;
    }

    public  void setName(int number) {
        this.number = number;
    }

    public String introduce() {
        return name+" "+number;
    }
}
