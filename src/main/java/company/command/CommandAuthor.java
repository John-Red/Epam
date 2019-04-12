package main.java.company.command;
import static main.java.company.Application.AUTHOR;



public class CommandAuthor extends ACommand {
    CommandAuthor(String name){
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is "+ AUTHOR);
    }
}
