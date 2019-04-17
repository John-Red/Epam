package company;

import company.command.ACommand;
import company.command.CommandRegistry;
import company.common.ConsoleCanvas;
import company.database.Record;
import company.database.Table;
import company.profile.ProfileController;
import company.state.ApplicationState;
import company.state.StateIdle;

import java.util.ArrayList;
import java.util.List;

public class Application {

    static public final String APP_NAME = "AIIX";
    static public final String AUTHOR = "Evgeniy Redin";
    static public final String VERSION = "0.0.0";
    static public final String WEATHER_KEY = "91ead9711dd84912af085935191204";

    static ApplicationState currentState; //currentState

    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        newState.enter(commandName);
    }

    public static void main(String[] args) {

        List<String> columns = new ArrayList<String>();
        columns.add("id");
        columns.add("firstName");
        columns.add("lastName");
        Table criminalTable = new Table("Criminals", columns);
        List<String> values = new ArrayList<String>();
        List<String> values2 = new ArrayList<String>();
        values.add("1");
        values.add("Vladimir");
        values.add("Trampo");
        values2.add("2");
        values2.add("Donald");
        values2.add("Timosh");
        criminalTable.insert(new Record(values));
        criminalTable.insert(new Record(values2));

        List<String> result = criminalTable.selectField("firstName");
        for (String s: result) {
            System.out.println(s);
        }


        // Two options for creating threads.

        // Runnable is an interface.
//        Runnable runnable1 = new Runnable() {
////            @Override
////            public void run() {
////                for (int i = 0; i < 100; i++) {
////                    System.out.printf("-");
////                    try {
////                        Thread.sleep(100);
////                    } catch (InterruptedException e) {
////
////                    }
////                }
////            }
////        };

//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.print(".");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//
//                    }
//                }
//                System.out.println("done!");
//            }
//        };

//        // Running two threads at the same time.
//        System.out.printf(thread.getState() + ""); // Prints thread state.
//        (new Thread(runnable1)).start();
//        thread.start();
//        System.out.printf(thread.getState() + "");

//        System.out.print("\nLoading");
//        thread.start();

//        ConsoleCanvas consoleCanvas = new ConsoleCanvas(100,100);
//        consoleCanvas.setSymbolAt(0,2,'A');
//        consoleCanvas.draw();
//        consoleCanvas.drawSquareAt(3,4, 4);


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

        ACommand command= CommandRegistry.INSTANCE.getCommand("time");
            command.execute();

    }
}