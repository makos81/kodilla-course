package com.kodilla.testing.weather.stub;

import java.util.Map;

public interface Temperatures {

    //first element of the map is an identifier of weather station
    //second element of the map is a temperature in Celsius degrees
    Map<String, Double> getTemperatures();
}

/*
klasy WeatherForecast o 2 dodatkowe metody oraz klasy WeatherForecastTestSuite o 2 dodatkowe testy:

Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy średnią temperaturę,
Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy medianę temperatur.
 */