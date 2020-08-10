package com.geektrust.traffic.transport;

/**
 * The type Bike.
 * Bike implementing Vehicle interface .
 */
public class Bike implements Vehicle {
  private final String vehicleName;
  private final double maxSpeed;

  private final double timePerCrater;

  /**
   * Instantiates a new Bike.
   * Setting the default value of Bike.
   */
  public Bike() {
    vehicleName = "BIKE";
    maxSpeed = 10;
    timePerCrater = 2;
  }

  @Override
  public double getTimePerCrater() {
    return timePerCrater;
  }

  @Override
  public String getVehicleName() {
    // compares vehicle speed with speedAllowed in orbit
    return vehicleName;
  }

  @Override
  public double bestSpeedOfVehicle(double speedAllowed) {
    return Math.min(maxSpeed, speedAllowed);
  }

}
