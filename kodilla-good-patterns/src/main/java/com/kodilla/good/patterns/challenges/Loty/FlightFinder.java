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

    public String getFlightsFrom(String departureAiport){
        return this.flightList.stream().filter(x->x.getDepartureAirport()
                .equals(departureAiport)).map(x->x.toString()).collect(Collectors.joining(", "));
    }

    public String getFlightsTo(String arrivalAirport){
        return this.flightList.stream().filter(x->x.getArrivalAirport()
                .equals(arrivalAirport)).map(x->x.toString()).collect(Collectors.joining(", "));
    }

    public String getFlightsVia(String departureAirport, String viaAirport, String arrivalAirport){
        List<Flight> flights = this.flightList.stream().filter(x->x.getDepartureAirport().equals(departureAirport))
                .filter(x->x.getArrivalAirport().equals(viaAirport)).collect(Collectors.toList());
        List<Flight> fligthsVia = this.flightList.stream().filter(x->x.getDepartureAirport().equals(viaAirport))
                .filter(x->x.getArrivalAirport().equals(arrivalAirport)).collect(Collectors.toList());
        if(fligthsVia.size()==0){
            return "not flight found via " + viaAirport;
        }else{
            flights.addAll(fligthsVia);
            return flights.stream().map(x->x.toString()).collect(Collectors.joining(", "));
        }
    }
}