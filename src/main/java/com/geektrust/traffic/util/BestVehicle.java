package com.geektrust.traffic.util;

import com.geektrust.traffic.model.IdealVehicleOnOrbit;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.transport.Vehicle;

import java.util.List;

public class BestVehicle {

  private IdealVehicleOnOrbit idealVehicleOnOrbit;

  public IdealVehicleOnOrbit requiredVehicleToBeUsed(List<Orbit> orbits, List<Vehicle> vehicles) {
    idealVehicleOnOrbit = new IdealVehicleOnOrbit();
    IdealVehicleOnOrbit vehicleWithSpeed;
    idealVehicleOnOrbit.setTimeTaken(Double.MAX_VALUE);

    for(Orbit orbit : orbits) {
      for(Vehicle vehicle : vehicles) {
        vehicleWithSpeed = getVehicleWithTimeTaken(orbit, vehicle);
        if (vehicleWithSpeed.compareTo(idealVehicleOnOrbit) <= 0) {
          idealVehicleOnOrbit = vehicleWithSpeed;
        }
      }
    }

    return idealVehicleOnOrbit;
  }

  private IdealVehicleOnOrbit getVehicleWithTimeTaken(Orbit orbit, Vehicle vehicle) {
    double time = findTimeTakenByVehicleInOrbit(orbit, vehicle);

    IdealVehicleOnOrbit vehicleObj = IdealVehicleOnOrbit.builder()
        .orbitName(orbit.getOrbitName())
        .vehicleName(vehicle.getVehicleName())
        .timeTaken(time)
        .timeTakenToClearCrater(vehicle.getTimePerCrater())
        .build();

    return vehicleObj;
  }

  private double findTimeTakenByVehicleInOrbit(Orbit orbit, Vehicle vehicle) {
    double totalTimeTaken;
    totalTimeTaken = timeTakenByVehicleSpeed(orbit.getDistanceFromDestination(),
        vehicle.bestSpeed(orbit.getAllowedOrbitSpeed()));
    totalTimeTaken += timeTakenToCrossCraters(orbit.getCraters(),
        vehicle.getTimePerCrater());
    return totalTimeTaken;
  }

  private double timeTakenToCrossCraters(int craters, double timePerCrater) {
    return craters * timePerCrater;
  }

  private double timeTakenByVehicleSpeed(double lengthOfOrbit, double vehicleSpeed) {
    double timeTakenInMinutes;
    timeTakenInMinutes = (lengthOfOrbit / vehicleSpeed) * 60;
    return timeTakenInMinutes;
  }
}
