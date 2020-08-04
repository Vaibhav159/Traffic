package com.geektrust.traffic.transport;

import lombok.Data;

@Data
public class Tuktuk implements Vehicle{

  private String vehicleName;
  private double maxSpeed;
  private double timePerCrater;

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
