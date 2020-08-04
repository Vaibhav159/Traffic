package com.geektrust.traffic.transport;

import lombok.Data;

import java.util.Set;

public class Bike implements Vehicle{
  private String vehicleName;
  private double maxSpeed;

  private double timePerCrater;

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
