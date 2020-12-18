package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //given
        Country poland = new Country("Poland", new BigDecimal(38000000));
        Country germany = new Country("Germany", new BigDecimal(78000000));
        Country czechia = new Country("Czechia", new BigDecimal(4000000));
        Country usa = new Country("usa", new BigDecimal(328000000));
        Country canada = new Country("Canada", new BigDecimal(37000000));
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        northAmerica.getCountryLitst().add(usa);
        northAmerica.getCountryLitst().add(canada);
        europe.getCountryLitst().add(poland);
        europe.getCountryLitst().add(germany);
        europe.getCountryLitst().add(czechia);
        World newWorld = new World();
        newWorld.getContinentList().add(northAmerica);
        newWorld.getContinentList().add(europe);
        BigDecimal expected = new BigDecimal(485000000);
        //when
        BigDecimal quantityResulted = newWorld.getContinentList().stream()
                .flatMap(x->x.getCountryLitst().stream()).map(x->x.getPeopleQuantity())
                .reduce(new BigDecimal(0),(x,y)->x.add(y));
        //then
        Assertions.assertEquals(expected, quantityResulted);
    }
}
