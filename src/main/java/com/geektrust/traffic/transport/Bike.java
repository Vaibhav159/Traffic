package com.geektrust.traffic.transport;

public class Bike implements Vehicle{
  private final String vehicleName;
  private final double maxSpeed;

  private final double timePerCrater;

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
    return vehicleName;
  }

  @Override
  public double bestSpeed(double speedAllowed) {
    return Math.min(maxSpeed, speedAllowed);
  }

}
