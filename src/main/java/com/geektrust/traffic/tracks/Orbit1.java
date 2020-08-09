package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public class Orbit1 implements Orbit{

  private final String orbitName;
  private final double distanceFromDestination;
  private int noOfCraters;

  private double orbitSpeed;

  public Orbit1() {
    orbitName = "ORBIT1";
    distanceFromDestination = 18;
    noOfCraters = 20;
  }

  @Override
  public String getOrbitName() {
    return orbitName;
  }

  @Override
  public double getDistanceFromDestination() {
    return distanceFromDestination;
  }

  @Override
  public int getCraters() {
    return noOfCraters;
  }

  @Override
  public void setAllowedOrbitSpeed(double speed) {
    orbitSpeed = speed;
  }

  @Override
  public double getAllowedOrbitSpeed() {
    return orbitSpeed;
  }
}
