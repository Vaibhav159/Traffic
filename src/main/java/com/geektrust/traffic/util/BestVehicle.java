package com.geektrust.traffic.util;

import com.geektrust.traffic.model.IdealVehicleOnOrbit;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.transport.Vehicle;

import java.util.List;

public class BestVehicle {

  private IdealVehicleOnOrbit idealVehicleOnOrbit = new IdealVehicleOnOrbit();

  public IdealVehicleOnOrbit requiredVehicleToBeUsed(List<Orbit> orbits, Weather currentWeather) {
    IdealVehicleOnOrbit vehicleWithSpeed;
    idealVehicleOnOrbit.setTimeTaken(Double.MAX_VALUE);
    List<Vehicle> vehicles = currentWeather.getVehicleAllowed();

    for(Orbit orbit : orbits) {
      for(Vehicle vehicle : vehicles) {
        int currentCraters = currentWeather.updateCraters(orbit.getCraters());
        vehicleWithSpeed = getVehicleWithTimeTaken(orbit, vehicle, currentCraters);
        if (vehicleWithSpeed.compareTo(idealVehicleOnOrbit) <= 0) {
          idealVehicleOnOrbit = vehicleWithSpeed;
        }
      }
    }

    return idealVehicleOnOrbit;
  }

  private IdealVehicleOnOrbit getVehicleWithTimeTaken(Orbit orbit, Vehicle vehicle, int currentCraters) {
    double time = findTimeTakenByVehicleInOrbit(orbit, vehicle, currentCraters);

    return IdealVehicleOnOrbit.builder()
        .orbitName(orbit.getOrbitName())
        .vehicleName(vehicle.getVehicleName())
        .timeTaken(time)
        .timeTakenToClearCrater(vehicle.getTimePerCrater())
        .build();
  }

  private double findTimeTakenByVehicleInOrbit(Orbit orbit, Vehicle vehicle, int currentCraters) {
    double totalTimeTaken;
    totalTimeTaken = timeTakenByVehicleSpeed(orbit.getDistanceFromDestination(),
        vehicle.bestSpeed(orbit.getAllowedOrbitSpeed()));
    totalTimeTaken += timeTakenToCrossCraters(currentCraters,
        vehicle.getTimePerCrater());
    return totalTimeTaken;
  }

  private double timeTakenToCrossCraters(int craters, double timePerCrater) {
    return craters * timePerCrater;
  }

  private double timeTakenByVehicleSpeed(double lengthOfOrbit, double vehicleSpeed) {
    double timeTakenInMinutes = (lengthOfOrbit / vehicleSpeed) * 60;
    return timeTakenInMinutes;
  }
}
