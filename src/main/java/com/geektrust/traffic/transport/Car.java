package com.geektrust.traffic.transport;

/**
 * The type Car.
 * Car implementing Vehicle interface
 */
public class Car implements Vehicle {
  private final String vehicleName;
  private final double maxSpeed;
  private final double timePerCrater;

  /**
   * Instantiates a new Car.
   * Setting the default value of Car.
   */
  public Car() {
    vehicleName = "CAR";
    maxSpeed = 20;
    timePerCrater = 3;
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
