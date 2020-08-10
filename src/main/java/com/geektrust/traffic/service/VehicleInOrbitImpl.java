package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleForOrbit;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.season.WeatherFactory;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.tracks.Orbit1;
import com.geektrust.traffic.tracks.Orbit2;
import com.geektrust.traffic.util.BestVehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Vehicle in orbit.
 * VehicleInOrbitImpl implementing the VehicleInOrbit interface
 */
public class VehicleInOrbitImpl implements VehicleInOrbit {
  private final List<Orbit> orbits = new ArrayList<>();
  private Weather currentSeason;
  private WeatherFactory weatherFactory;
  private BestVehicle bestVehicle;

  /**
   * Instantiates a new Vehicle in orbit.
   * Primary initialization of all the variables.
   */
  public VehicleInOrbitImpl() {
    bestVehicle = new BestVehicle();
    weatherFactory = new WeatherFactory();
    orbits.add(new Orbit1());
    orbits.add(new Orbit2());
  }

  /**
   * Gets best vehicle.
   * @param weather          the weather
   *                         for which we need to find
   *                         orbit and Vehicle
   * @param maxSpeedAtOrbit1 the max speed at orbit 1
   *                         max Allowed speed in
   *                         orbit1
   * @param maxSpeedAtOrbit2 the max speed at orbit 2
   *                         max Allowed speed in
   *                         orbit2
   * @return Returns the required Vehicle For the given Weather
   */
  public IdealVehicleForOrbit getBestVehicle(
      String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2) {
    setCurrentWeather(weather);
    orbits.get(0).setAllowedOrbitSpeed(maxSpeedAtOrbit1);
    orbits.get(1).setAllowedOrbitSpeed(maxSpeedAtOrbit2);
    return bestVehicle.requiredVehicleToBeUsed(orbits, currentSeason);
  }

  /**
   * Set current Weather.
   * @param weather weather from input implying the current weather
   */
  private void setCurrentWeather(String weather) {
    // sets weather object from weather factory class
    // to current season
    currentSeason = weatherFactory.createBasedOnWeather(weather);
  }
}
