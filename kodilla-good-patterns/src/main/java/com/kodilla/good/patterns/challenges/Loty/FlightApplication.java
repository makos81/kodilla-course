package com.kodilla.good.patterns.challenges.Loty;

public class FlightApplication {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight(new Flight("Warszawa", "Poznan"));
        flightFinder.addFlight(new Flight("Warszawa", "Gdansk"));
        flightFinder.addFlight(new Flight("Gdansk", "Wroclaw"));
        flightFinder.addFlight(new Flight("Wroclaw", "Poznan"));
        flightFinder.addFlight(new Flight("Poznan", "Wroclaw"));

        System.out.println("Searched for flight from Warszawa \n" +
                flightFinder.generateStringFormat(flightFinder.getFlightsFrom("Warszawa")));
        System.out.println("Searched for flight to Poznan \n" +
                flightFinder.generateStringFormat(flightFinder.getFlightsTo("Poznan")));
        System.out.println("Searched for flight from Warszawa to Wroclaw with transfer \n" +
                flightFinder.generateStringFormat(flightFinder.getFlightsVia("Warszawa","Wroclaw")));
    }
}
