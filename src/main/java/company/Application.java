package main.java.company;

import main.java.company.State.ApplicationState;
import main.java.company.command.*;

public class Application {

    static public final String APP_NAME = "AIIX";
    static public final String AUTHOR = "Evgeniy Redin";
    static public final String VERSION = "0.0.0";


    static ApplicationState currentState; //currentState

    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        newState.enter(commandName);
    }

    public static void main(String[] args) {
//        changeState(new StateIdle(), "Idle");
//        //reading input
//       String commandName = "test command";
//        //receiving 10 new commands
//        for (int i = 0; i < 10; i++) {
//            currentState.onCommand(commandName + i);
//        }

        ACommand command= CommandRegistry.INSTANCE.getCommand("version");
        command.execute();
    }
}