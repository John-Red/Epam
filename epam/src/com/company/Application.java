package com.company;

import  com.company.command.*;


public class Application {

    static public final String APP_NAME = "AIIX";
    static public final String AUTHOR = "Evgeniy Redin";
    static public final String VERSION = "0.0.0";

    public static void main(String[] args) {
        String currentName = "author";
        ACommand command = CommandRegistry.INSTANCE.getCommand(currentName);
        command.execute();

    }
}
