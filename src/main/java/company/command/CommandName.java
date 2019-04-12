package main.java.company.command;
import static main.java.company.Application.APP_NAME;


public class CommandName extends ACommand {
    CommandName(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("My name is "+APP_NAME);
    }
}
