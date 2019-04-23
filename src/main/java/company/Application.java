package company;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.weatherlibraryjava.Repository;
import com.weatherlibraryjava.RequestBlocks;
import company.command.ACommand;
import company.command.CommandRegistry;
import company.common.BaseView;
import company.common.Canvas;
import company.common.ConsoleCanvas;
import company.database.DataBase;
import company.database.Record;
import company.database.Table;
import company.profile.ProfileController;
import company.profile.ProfileView;
import company.state.ApplicationState;
import company.state.StateIdle;
import javafx.scene.control.Tab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    static public final String APP_NAME = "AIIX";
    static public final String AUTHOR = "Evgeniy Redin";
    static public final String VERSION = "0.0.4";
    static public final String WEATHER_KEY = "91ead9711dd84912af085935191204";

    static ApplicationState currentState; //currentState#

    public static final String ALLOWED_DOMAIN_NAMES = "^([a-zA-Z0-9]+\\.)+(com|org|de|gov)$";

    public static final String OP_GROUP= "^(SELECT|DELETE)";
    public static final String FLD_GROUP= "([*a-zA-z, ]+)";
    public static final String SPACE= "([\\s]+)";
    public static final String FROM_GROUP="(FROM)";
    public static final String TBL_GROUP="([a-zA-Z]+)$";



    public static void changeState(ApplicationState newState, String commandName) {
        if (currentState != null) {
            currentState.exit();
        }
        currentState = newState;
        newState.enter(commandName);
    }
// строки в профили профили в модели


    public static void main(String[] args) {

        String query = "SELECT *, id, firstName, numberOfCrimes lastName FROM Criminals";
          Pattern p = Pattern.compile(OP_GROUP+SPACE+FLD_GROUP+SPACE+FROM_GROUP+SPACE+TBL_GROUP);
        Matcher matcher= p.matcher(query);
        if (matcher.find()){
            System.out.println("Number of groups "+ matcher.groupCount());
            for (int i=0, len=matcher.groupCount(); i<=len; i++){
                System.out.println("Group "+i+": "+matcher.group(i));
            }
        }


//        List<String> records = DataBase.readDataFile("C:\\Git/Criminals.tbl");
//        ConsoleCanvas canvas=new ConsoleCanvas(80,30);
//        ProfileView  view = new ProfileView();
//        view.setRecords(records);
//        view.draw(canvas);


//        Table table = new Table("Criminals", Arrays.asList(new String[]{"id", "name", "deceased"}));
//        Record record = new Record(table);
//        record.setValues(new String[]{"100", "Anthony Soprano", "false"});
//        try {
//            System.out.println(record.getInt("id"));
//            System.out.println(record.getBoolean("deceased"));
//        } catch (Record.FieldNotFoundExeption ex) {
//            ex.printStackTrace();
//        } catch (NumberFormatException nfe) {
//            nfe.printStackTrace();
//        }
//        System.out.println("All is ok, all exceptions have been caught!");


//        List<String> columns = new ArrayList<String>();
//        columns.add("id");
//        columns.add("firstName");
//        columns.add("lastName");
//        Table criminalTable = new Table("Criminals", columns);
//        List<String> values = new ArrayList<String>();
//        List<String> values2 = new ArrayList<String>();
//        values.add("1");
//        values.add("Vladimir");
//        values.add("Trampo");
//        values2.add("2");
//        values2.add("Donald");
//        values2.add("Timosh");
//        criminalTable.insert(new Record(values));
//        criminalTable.insert(new Record(values2));
//
//        List<String> result = criminalTable.selectField("firstName");
//        for (String s: result) {
//            System.out.println(s);
//        }

//        ConsoleCanvas consoleCanvas = new ConsoleCanvas(100,100);
//        consoleCanvas.setSymbolAt(0,2,'A');
//        consoleCanvas.draw();
//        consoleCanvas.drawSquareAt(3,4, 4);


//        ProfileController controller=new ProfileController();
//        controller.showProfile(2);


//        changeState(new StateIdle(), "Idle");
//        //reading input
//       String commandName = "test command";
//        //receiving 10 new commands
//        for (int i = 0; i < 10; i++) {
//            currentState.onCommand(commandName + i);
//        }

//        ACommand command= CommandRegistry.INSTANCE.getCommand("time");
//            command.execute();

    }
}