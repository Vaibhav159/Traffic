package com.geektrust.traffic.transport;

/**
 * The type Tuktuk.
 * Tuktuk implementing Vehicle interface
 */
public class Tuktuk implements Vehicle {

  private final String vehicleName;
  private final double maxSpeed;
  private final double timePerCrater;

  /**
   * Instantiates a new Tuktuk.
   * Setting the default value of Tuktuk.
   */
  public Tuktuk() {
    vehicleName = "TUKTUK";
    maxSpeed = 12;
    timePerCrater = 1;
  }

  @Override
  public double getTimePerCrater() {
    return timePerCrater;
  }

  @Override
  public double bestSpeedOfVehicle(double speedAllowed) {
    // compares vehicle speed with speedAllowed in orbit
    return Math.min(maxSpeed, speedAllowed);
  }

  @Override
  public String getVehicleName() {
    return vehicleName;
  }
}
