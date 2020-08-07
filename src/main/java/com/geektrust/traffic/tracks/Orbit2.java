package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public class Orbit2 implements Orbit{

  private final String orbitName;
  private final double distanceFromDestination;
  private int noOfCraters;
  private double orbitSpeed;

  public Orbit2() {
    orbitName = "ORBIT2";
    distanceFromDestination = 20;
    noOfCraters = 10;
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
  public void updateCraters(Weather weather) {
    noOfCraters = weather.updateCraters(noOfCraters);
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
