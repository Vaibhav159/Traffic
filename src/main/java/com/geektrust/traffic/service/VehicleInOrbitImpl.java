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

public class VehicleInOrbitImpl implements VehicleInOrbit {
  private final List<Orbit> orbits = new ArrayList<>();
  private Weather currentSeason;
  private WeatherFactory weatherFactory;
  private BestVehicle bestVehicle;

  public VehicleInOrbitImpl() {
    bestVehicle = new BestVehicle();
    weatherFactory = new WeatherFactory();
    orbits.add(new Orbit1());
    orbits.add(new Orbit2());
  }

  public IdealVehicleForOrbit getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2) {
    setCurrentWeather(weather);
    orbits.get(0).setAllowedOrbitSpeed(maxSpeedAtOrbit1);
    orbits.get(1).setAllowedOrbitSpeed(maxSpeedAtOrbit2);
    return bestVehicle.requiredVehicleToBeUsed(orbits, currentSeason);
  }

  private void setCurrentWeather(String weather) {
    currentSeason = weatherFactory.createBasedOnWeather(weather);
  }
}
