package com.kodilla.good.patterns.challenges.Loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private List<Flight> flightList;

    public FlightFinder() {
        this.flightList = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        flightList.add(flight);
    }

    public List<Flight> getFlightsFrom(String departureAiport){
        return this.flightList.stream().filter(x->x.getDepartureAirport()
                .equals(departureAiport)).collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(String arrivalAirport){
        return this.flightList.stream().filter(x->x.getArrivalAirport()
                .equals(arrivalAirport)).collect(Collectors.toList());
    }

    public List<Flight> getFlightsVia(String departureAirport, String arrivalAirport){
        List<Flight> flightsFrom = getFlightsFrom(departureAirport);
        List<Flight> flightsTo = getFlightsTo(arrivalAirport);
        List<Flight> flightsWithTransfer = new ArrayList<>();

        for(Flight flightFrom: flightsFrom) {
            for (Flight flightTo : flightsTo) {
                if (flightFrom.getArrivalAirport().equals(flightTo.getDepartureAirport())) {
                    flightsWithTransfer.addAll(List.of(flightFrom, flightTo));
                }
            }
        }
        return flightsWithTransfer;
    }

    public String generateStringFormat(List<Flight> flightList){
        return flightList.stream().map(x->x.toString()).collect(Collectors.joining(", "));
    }
}