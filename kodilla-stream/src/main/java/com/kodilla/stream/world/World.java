package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continentList;

    public World() {
        continentList = new ArrayList<>();
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
