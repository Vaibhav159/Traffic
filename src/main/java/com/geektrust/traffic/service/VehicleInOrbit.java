package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleForOrbit;

/**
 * The interface Vehicle in orbit.
 */
public interface VehicleInOrbit {
  /**
   * Gets best vehicle.
   *
   * @param weather          the weather
   *                         for which we need to find
   *                         orbit and Vehicle
   * @param maxSpeedAtOrbit1 the max speed at orbit 1
   *                         max Allowed speed in
   *                         orbit1
   * @param maxSpeedAtOrbit2 the max speed at orbit 2
   *                         max Allowed speed in
   *                         orbit2
   * @return the best vehicle
   *     Returns the required Vehicle For the given Weather
   */
  IdealVehicleForOrbit getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2);
}
