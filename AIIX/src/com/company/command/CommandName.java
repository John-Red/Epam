package com.company.command;
import static com.company.Application.APP_NAME;

public class CommandName extends ACommand{
    CommandName(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("My name is "+APP_NAME);
    }
}
