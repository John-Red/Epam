package com.company.command;

import com.weatherlibrary.datamodel.Forecastday;

public class CommandWeather extends ACommand{
    Forecastday forecast;

    CommandWeather(String name) {
        super(name);
        forecast=new Forecastday();
    }

    @Override
    public void execute() {
        forecast.setDate("12.04.2019");
        System.out.println(forecast.date);
    }
}
