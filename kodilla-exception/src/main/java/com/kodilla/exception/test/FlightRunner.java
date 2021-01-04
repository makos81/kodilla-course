package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args){
        Flight flight = new Flight("Oslo", "Warsaw2");
        FlightFinder flightFinder = new FlightFinder();
        boolean foundFlight = false;
        try{
            foundFlight = flightFinder.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("Route not found " + e);
        }
        System.out.println("Can flight? " + foundFlight);
    }
}
