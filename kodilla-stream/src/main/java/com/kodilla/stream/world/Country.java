package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryName;
    private BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity(){
        return this.peopleQuantity;
    }
}
