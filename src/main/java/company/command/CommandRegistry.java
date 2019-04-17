package company.command;

import com.weatherlibrary.datamodel.WeatherModel;
import com.weatherlibraryjava.IRepository;
import com.weatherlibraryjava.Repository;

import java.util.HashMap;
import java.util.Map;

import static company.Application.WEATHER_KEY;


/**
 * Makes registry of commands and add it in HashMap to use it in tha application.
 */
public enum CommandRegistry {
    INSTANCE;

    /**
     * Makes HashMap to save all available commands.
     */
    static   Map<String, ACommand> commands;
    static IRepository repository;
    static WeatherModel weatherModel;
    static {
        repository=new Repository();
        try {
            weatherModel=repository.GetWeatherDataByAutoIP(WEATHER_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        commands = new HashMap<String, ACommand>();
        commands.put("author", new CommandAuthor("author"));
        commands.put("version", new CommandVersion("version"));
        commands.put("name", new CommandName("name"));
        commands.put("weather", new CommandWeather("weather",weatherModel));
        commands.put("time", new CommandTime("time", weatherModel));
    }

    /**
     * @return Object type ACommand
     * @param name require a name of a command to return.
     */
    public ACommand getCommand (String name){
        return commands.get(name);
    }

    /**
     * Method to write in console available commands.
     */
    public void showCommands (){
        for (Map.Entry<String, ACommand> entry : commands.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}
