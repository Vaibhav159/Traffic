package com.geektrust.traffic.service;

import com.geektrust.traffic.season.Rainy;
import com.geektrust.traffic.season.Sunny;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.season.Windy;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.tracks.Orbit1;
import com.geektrust.traffic.tracks.Orbit2;
import com.geektrust.traffic.transport.Vehicle;

import java.util.List;

public class VehicleInOrbitImpl implements VehicleInOrbit {
  private List<Weather> weathers;
  private List<Orbit> orbits;
  private Weather currentSeason;


  public VehicleInOrbitImpl() {
    weathers.add(new Rainy());
    weathers.add(new Windy());
    weathers.add(new Sunny());
    orbits.add(new Orbit1());
    orbits.add(new Orbit2());
  }

  public void getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2) {
    setCurrentWeather(weather);
    updateCratersForEachOrbit();
    setMaxSpeedForEachVehicle(maxSpeedAtOrbit1);
    setMaxSpeedForEachVehicle(maxSpeedAtOrbit2);
  }

  private void setMaxSpeedForEachVehicle(int maxSpeedAtOrbit) {
    for(Vehicle vehicle : currentSeason.getVehicleAllowed()) {
      vehicle.bestSpeed(maxSpeedAtOrbit);
    }
  }

  private void updateCratersForEachOrbit() {
    for(Orbit orbit : orbits) {
      orbit.updateCraters(currentSeason);
    }
  }

  private void setCurrentWeather(String weather) {
    for(Weather season : weathers) {
      if (weather.equals(season.getName())) {
        currentSeason = season;
        break;
      }
    }
  }
}
