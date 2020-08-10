package com.geektrust.traffic.transport;

/**
 * The interface Vehicle.
 * Interface can be extended by any type of vehicle
 */
public interface Vehicle {

  /**
   * Gets time per crater.
   *
   * @return the time per crater.
   *      time taken by vehicle to
   *      cross a crater
   */
  double getTimePerCrater();

  /**
   * Gets vehicle name.
   *
   * @return the vehicle name
   *     returns the Vehicle Name
   */
  String getVehicleName();

  /**
   * Best speed of vehicle double.
   *
   * @param speedAllowed the speed allowed
   *                     Traffic speed limitation
   *                     of an orbit
   * @return the double
   *     returns the bestSpeed a Vehicle can Have
   *     in that orbit
   */
  double bestSpeedOfVehicle(double speedAllowed);
}
