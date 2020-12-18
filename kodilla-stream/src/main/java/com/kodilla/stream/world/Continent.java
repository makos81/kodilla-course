package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private List<Country> countryLitst;

    public Continent(String name) {
        this.name = name;
        this.countryLitst = new ArrayList<>();
    }

    public List<Country> getCountryLitst() {
        return countryLitst;
    }
}
