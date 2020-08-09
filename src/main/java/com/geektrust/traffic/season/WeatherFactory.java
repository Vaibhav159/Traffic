package com.geektrust.traffic.season;

public class WeatherFactory {

  public Weather createBasedOnWeather(String weather) {

    switch (weather) {
      case "RAINY":
        return new Rainy();
      case "SUNNY":
        return new Sunny();
      case "WINDY":
        return new Windy();
      default:
        return new Weather();
    }

  }
}
