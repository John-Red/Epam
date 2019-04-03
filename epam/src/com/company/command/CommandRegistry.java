package com.company.command;

import java.util.HashMap;
import java.util.Map;

public enum CommandRegistry {
    INSTANCE;
      static   Map<String,ACommand> commands;

    static {
        commands = new HashMap<>();
        commands.put("author", new CommandAuthor("author"));
        commands.put("version", new CommandVersion("version"));
        commands.put("name", new CommandName("name"));
    }

    public ACommand getCommand (String name){
        return commands.get(name);
    }

}
