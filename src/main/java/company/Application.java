package company;

import company.command.ACommand;
import company.command.CommandRegistry;
import company.common.ConsoleCanvas;
import company.profile.ProfileController;
import company.state.ApplicationState;
import company.state.StateIdle;

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

        ConsoleCanvas consoleCanvas=new ConsoleCanvas();
        consoleCanvas.init(10,10,'.');
        consoleCanvas.drawArray();

//        ProfileController controller=new ProfileController();
//        controller.showProfile(2);
//
//
//
//
//        changeState(new StateIdle(), "Idle");
//        //reading input
//       String commandName = "test command";
//        //receiving 10 new commands
//        for (int i = 0; i < 10; i++) {
//            currentState.onCommand(commandName + i);
//        }

        ACommand command= CommandRegistry.INSTANCE.getCommand("weather");
            command.execute();

    }
}