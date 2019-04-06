package com.company.command;
import static com.company.Application.AUTHOR;


public class CommandAuthor extends ACommand {
    CommandAuthor(String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is "+ AUTHOR);
    }
}
