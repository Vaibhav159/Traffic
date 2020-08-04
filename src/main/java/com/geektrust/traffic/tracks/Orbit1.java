package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public class Orbit1 implements Orbit{

  private String orbitName;
  private double distanceFromDestination;
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
