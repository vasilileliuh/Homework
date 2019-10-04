package com.company;

public class Manager extends Employee {

    private int teamSize;

    public void reportProject(int teamSize){
        this.teamSize = teamSize;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    public void reportProjectStatus(){
        System.out.println("Status is ok!");
    }
}
