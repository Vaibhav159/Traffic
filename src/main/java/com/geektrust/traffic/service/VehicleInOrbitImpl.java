package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleOnOrbit;
import com.geektrust.traffic.season.Rainy;
import com.geektrust.traffic.season.Sunny;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.season.Windy;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.tracks.Orbit1;
import com.geektrust.traffic.tracks.Orbit2;
import com.geektrust.traffic.util.BestVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInOrbitImpl implements VehicleInOrbit {
  private List<Weather> weathers = new ArrayList<>();
  private List<Orbit> orbits = new ArrayList<>();
  private Weather currentSeason;

  public VehicleInOrbitImpl() {
    weathers.add(new Rainy());
    weathers.add(new Windy());
    weathers.add(new Sunny());
    orbits.add(new Orbit1());
    orbits.add(new Orbit2());
  }

  public IdealVehicleOnOrbit getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2) {
    setCurrentWeather(weather);
    updateCratersForEachOrbit();
    orbits.get(0).setAllowedOrbitSpeed(maxSpeedAtOrbit1);
    orbits.get(1).setAllowedOrbitSpeed(maxSpeedAtOrbit2);
    return (new BestVehicle().requiredVehicleToBeUsed(orbits, currentSeason.getVehicleAllowed()));
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
