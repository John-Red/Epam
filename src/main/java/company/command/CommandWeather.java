package company.command;

import com.weatherlibrary.datamodel.WeatherModel;
import com.weatherlibraryjava.Repository;


public class CommandWeather extends ACommand {
//   Repository repository;
//     static final String KEY = "91ead9711dd84912af085935191204";
//     WeatherModel weatherModel;

    CommandWeather(String name) {
        super(name);
 //       repository=new Repository();
//        try {
//            weatherModel=repository.GetWeatherDataByAutoIP(KEY);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void execute() {
       System.out.println("  ");
    }
}
