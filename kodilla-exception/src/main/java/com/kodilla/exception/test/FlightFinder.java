package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

/*
metoda findFilght(Flight flight)
wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska,
a wartością Boolean informujący o tym czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean.
logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić \
wyjątkiem RouteNotFoundException.
 */
public class FlightFinder {
    private Map<String, Boolean> flightMap;

    public FlightFinder(){
        flightMap = new HashMap<>();
        flightMap.put("Berlin", true);
        flightMap.put("Warsaw", true);
        flightMap.put("London", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        boolean arrivalAirport = false;
        try{
            arrivalAirport = flightMap.get(flight.getArrivalAirport());
        }catch(Exception message){
            throw new RouteNotFoundException("Airport not found ");
        }
        return arrivalAirport;
    }
}
