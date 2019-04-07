package com.company.command;

import java.util.HashMap;
import java.util.Map;


/**
 * Makes registry of commands and add it in HashMap to use it in tha application.
 */
public enum CommandRegistry {
    INSTANCE;

    /**
     * Makes HashMap to save all available commands.
     */
      static   Map<String,ACommand> commands;

    static {
        commands = new HashMap<>();
        commands.put("author", new CommandAuthor("author"));
        commands.put("version", new CommandVersion("version"));
        commands.put("name", new CommandName("name"));
    }

    /**
     * @return Object type ACommand
     * @param name require a name of a command to return.
     */
    public ACommand getCommand (String name){
        return commands.get(name);
    }

    /**
     * Method to write in console available commands.
     */
    public void showCommands (){
        for (Map.Entry<String, ACommand> entry : commands.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}
