package company.command;

import com.weatherlibrary.datamodel.WeatherModel;
import com.weatherlibraryjava.IRepository;
import static company.Application.WEATHER_KEY;


public class CommandWeather extends ACommand {

    private WeatherModel weatherModel;

    CommandWeather(String name,WeatherModel weathermodel) {
        super(name);

        this.weatherModel=weathermodel;
    }

    @Override
    public void execute() {
        System.out.println("Your location " + weatherModel.location.name);
        System.out.println("Temperature " + weatherModel.current.temp_c);
        System.out.println("Baby it's " + opinion() + " outside");
    }

    private String opinion() {
        if (weatherModel.current.temp_c < 5) {
            return "cold";
        }
        if (weatherModel.current.temp_c > 23) {
            return "hot";
        } else return "warm";
    }
}
