package company.state;
import company.Application;


public class StateExecutingCommand extends ApplicationState {


    @Override
    public void enter(String commandName) {
        System.out.println("Entering state Executing Command" + commandName);
        //get command by name;
        //command execute
        executeCommand(commandName);
    }

    private void executeCommand(String commandName) {
        //code for execution
        Application.changeState(new StateIdle(), "Idle");
    }

    @Override
    public void onCommand(String commandName) {
        System.out.println("Busy executing command..." + commandName + " has to wait");
    }

    @Override
    public void exit() {
        System.out.println("Leaving state Executing Command");
    }
}