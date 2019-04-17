package company.command;

import com.weatherlibrary.datamodel.WeatherModel;
import com.weatherlibraryjava.IRepository;
import static company.Application.WEATHER_KEY;
public class CommandTime extends ACommand{


    private WeatherModel weatherModel;
    CommandTime(String name, WeatherModel weatherModel) {
        super(name);
        this.weatherModel=weatherModel;
    }

    @Override
    public void execute() {
        System.out.println("Time "+weatherModel.location.localtime);
    }
}
