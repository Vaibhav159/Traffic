package com.geektrust.traffic.season;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherFactoryTest {


  private WeatherFactory weatherFactory;
  private String weather;
  private Weather weatherReceived;
  private Weather weatherExpected;

  @BeforeEach
  void setUp() {
    weatherFactory = new WeatherFactory();
  }

  @Test
  void createRainyObject() {
    weather = "RAINY";
    weatherReceived = weatherFactory.createBasedOnWeather(weather);
    assertEquals(weather, weatherReceived.getWeatherType());
    assertEquals(2, weatherReceived.getVehicleAllowed().size());
  }

  @Test
  void createSunnyObject() {
    weather = "SUNNY";
    weatherReceived = weatherFactory.createBasedOnWeather(weather);
    assertEquals(weather, weatherReceived.getWeatherType());
    assertEquals(3, weatherReceived.getVehicleAllowed().size());
  }

  @Test
  void createWindyObject() {
    weather = "WINDY";
    weatherReceived = weatherFactory.createBasedOnWeather(weather);
    assertEquals(weather, weatherReceived.getWeatherType());
    assertEquals(2, weatherReceived.getVehicleAllowed().size());
  }

  @Test
  void notExistingWeatherObject() {
    weather = "DRY";
    weatherReceived = weatherFactory.createBasedOnWeather(weather);
    assertNull(weatherReceived.getWeatherType());
    assertEquals(0, weatherReceived.getVehicleAllowed().size());
  }
}