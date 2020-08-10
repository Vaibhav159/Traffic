package com.geektrust.traffic.util;

import com.geektrust.traffic.model.IdealVehicleForOrbit;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.transport.Vehicle;
import java.util.List;

/**
 * The type Best vehicle.
 */
public class BestVehicle {

  private IdealVehicleForOrbit idealVehicleForOrbit = new IdealVehicleForOrbit();

  /**
   * Required vehicle to be used ideal vehicle for orbit.
   *
   * @param orbits         the orbits
   *                       takes all the existing orbits
   * @param currentWeather the current weather
   *                       takes the current weather according
   *                       to the input
   * @return the ideal vehicle for orbit
   *     returns the optimal vehicle to travel
   */
  public IdealVehicleForOrbit requiredVehicleToBeUsed(List<Orbit> orbits, Weather currentWeather) {

    IdealVehicleForOrbit vehicleWithSpeed;

    //setting the current vehicle to max for comparison
    idealVehicleForOrbit.setTimeTaken(Double.MAX_VALUE);

    //extracts all the vehicles allowed in current weather
    List<Vehicle> vehicles = currentWeather.getVehicleAllowed();

    // iterating over all the orbits
    for (Orbit orbit : orbits) {

      // crates getting updated according to the weather
      int currentCraters = currentWeather.updateCraters(orbit.getCraters());

      // iterating over all the vehicles in the orbit
      for (Vehicle vehicle : vehicles) {

        vehicleWithSpeed = getVehicleWithTimeTaken(orbit, vehicle, currentCraters);

        // Comparison of two IdealVehicleForOrbit objects and updates when
        // vehicleWithSpeed is less than idealVehicleForOrbit
        if (vehicleWithSpeed.compareTo(idealVehicleForOrbit) <= 0) {
          idealVehicleForOrbit = vehicleWithSpeed;
        }
      }
    }

    return idealVehicleForOrbit;
  }

  // Generates a object of IdealVehicleForOrbit with time taken
  private IdealVehicleForOrbit getVehicleWithTimeTaken(
      Orbit orbit, Vehicle vehicle, int currentCraters) {
    double time = findTimeTakenByVehicleInOrbit(
        orbit, vehicle, currentCraters);

    return IdealVehicleForOrbit.builder()
        .orbitName(orbit.getOrbitName())
        .vehicleName(vehicle.getVehicleName())
        .timeTaken(time)
        .timeTakenToClearCrater(vehicle.getTimePerCrater())
        .build();
  }

  // Returns the total time taken by a Vehicle to cross a given orbit
  private double findTimeTakenByVehicleInOrbit(Orbit orbit, Vehicle vehicle, int currentCraters) {
    double totalTimeTaken;
    totalTimeTaken = timeTakenByVehicleSpeed(orbit.getDistanceFromDestination(),
        vehicle.bestSpeedOfVehicle(orbit.getAllowedOrbitSpeed()));
    totalTimeTaken += timeTakenToCrossCraters(currentCraters,
        vehicle.getTimePerCrater());
    return totalTimeTaken;
  }

  // Returns the time taken by a Vehicle to cross a given orbit with traffic speed imposed
  private double timeTakenToCrossCraters(int craters, double timePerCrater) {
    return craters * timePerCrater;
  }

  // Returns the time taken by a Vehicle to cross all craters of a given orbit
  private double timeTakenByVehicleSpeed(double lengthOfOrbit, double vehicleSpeed) {
    return (lengthOfOrbit / vehicleSpeed) * 60;
  }
}
