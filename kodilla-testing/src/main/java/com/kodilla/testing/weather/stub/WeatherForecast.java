package com.kodilla.testing.weather.stub;

import java.lang.reflect.Array;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double getAverageTemp() {
        List<Double> listOfTemp = createListWithTemp(temperatures.getTemperatures());
        return doAverage(listOfTemp);
    }

    private double doAverage(List<Double> list){
        if(list.size()==0)
            return 0;
        Double sum = 0.0;
        for(Double e: list){
            sum+=e;
        }
        return sum/list.size();
    }

    private List<Double> createListWithTemp(Map<String, Double> temperaturesMap){
        List<Double> resultedList = new ArrayList<>();
        for(Map.Entry<String, Double> e: temperaturesMap.entrySet()){
            resultedList.add(e.getValue());
        }
        return resultedList;
    }

    public double getMedianTemp() {
        List<Double> listOfTemp = createListWithTemp(temperatures.getTemperatures());
        return doMedian(listOfTemp);
    }

    private double doMedian(List<Double> list){
        if(list.size()==0)
            return 0;
        int size = list.size();
        Collections.sort(list);
        if(list.size()%2==1){
            return size==1? list.get(0): list.get(size/2);
        }
        else{
            return (list.get((size-1)/2) + list.get(size/2))/2;
        }
    }

}

/*
klasy WeatherForecast o 2 dodatkowe metody oraz klasy WeatherForecastTestSuite o 2 dodatkowe testy:
Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy średnią temperaturę,
Napisz metodę (i test do niej), która na podstawie danych z interfejsu obliczy medianę temperatur.
 */