package com.geektrust.traffic.transport;

import lombok.Data;

import java.util.Set;

@Data
public class Car implements Vehicle{
  private String vehicleName;
  private double maxSpeed;
  private double timePerCrater;

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
    return vehicleName;
  }

  @Override
  public double bestSpeed(double speedAllowed) {
    return Math.min(maxSpeed, speedAllowed);
  }

}
