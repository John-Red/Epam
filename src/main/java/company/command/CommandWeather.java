package company.command;

import com.google.gson.Gson;
import com.weatherlibrary.datamodel.Forecast;
import com.weatherlibrary.datamodel.WeatherModel;
import com.weatherlibraryjava.IRepository;
import com.weatherlibraryjava.Repository;
import com.weatherlibraryjava.RequestBlocks;


public class CommandWeather extends ACommand {
   private IRepository repository;
     private static final String KEY = "91ead9711dd84912af085935191204";
     private WeatherModel weatherModel;

    CommandWeather(String name) {
        super(name);
        repository=new Repository();

    }

    @Override
    public void execute() {
        try {
            weatherModel=repository.GetWeatherDataByAutoIP(KEY);
            System.out.println("Your location "+weatherModel.location.name);
            System.out.println("Temperature "+weatherModel.current.temp_c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
