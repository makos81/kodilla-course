package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperatures;

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAveragePerSite(){
        //given
        HashMap<String, Double> temperaturesPerSite = new HashMap<>();
        temperaturesPerSite.put("Stacja1",1.0);
        temperaturesPerSite.put("Stacja1", 2.0);
        temperaturesPerSite.put("Stacja1", 3.0);
        temperaturesPerSite.put("Stacja2",2.0);
        when(temperatures.getTemperatures()).thenReturn(temperaturesPerSite);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        double expectedResults = 2.5;
        //when
        double averagesPerSiteResult = weatherForecast.getAverageTemp();
        //then
        Assertions.assertEquals(expectedResults,averagesPerSiteResult);
    }

    @Test
    void testCalculateMedianPerSite(){
        //given
        HashMap<String, Double> temperaturesPerSite = new HashMap<>();
        temperaturesPerSite.put("Stacja1",1.0);
        temperaturesPerSite.put("Stacja2", 2.0);
        temperaturesPerSite.put("Stacja3", 4.0);
        when(temperatures.getTemperatures()).thenReturn(temperaturesPerSite);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        double expectedResults = 2.0;
        //when
        double medianPerSiteResult = weatherForecast.getMedianTemp();
        //then
        Assertions.assertEquals(expectedResults, medianPerSiteResult);
    }
}