package company.command;

import static company.ApplicationConst.AUTHOR;

public class CommandAuthor extends ACommand {
    CommandAuthor(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Author is " + AUTHOR);
    }
}
