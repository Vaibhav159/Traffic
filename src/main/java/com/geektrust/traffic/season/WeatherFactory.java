package com.geektrust.traffic.season;

/**
 * The type Weather factory.
 */
public class WeatherFactory {

  /**
   * Create based on weather weather.
   *
   * @param weather the weather input provided by
   *                the user input
   * @return the weather
   *     returns the weather object of required weather type
   */
  public Weather createBasedOnWeather(String weather) {

    // switch case to match the required weather and
    // returns its object.
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
