package com.company.command;

public abstract class ACommand {
    private String name;
    ACommand(String name){
        this.name=name;
    }
    public void execute(){
        System.out.println("Command"+ name+" is not implemented");
    }
}
