package com.geektrust.traffic.transport;

import lombok.Data;

@Data
public class Tuktuk implements Vehicle{

  private final String vehicleName;
  private final double maxSpeed;
  private final double timePerCrater;

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
  public double bestSpeed(double speedAllowed) {
    return Math.min(maxSpeed, speedAllowed);
  }

  @Override
  public String getVehicleName() {
    return vehicleName;
  }
}
