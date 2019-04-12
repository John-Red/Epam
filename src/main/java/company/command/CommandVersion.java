package main.java.company.command;
import static main.java.company.Application.VERSION;


public class CommandVersion extends ACommand {
    CommandVersion (String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("The version is " + VERSION);
    }
}
