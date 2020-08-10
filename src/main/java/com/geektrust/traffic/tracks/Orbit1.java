package com.geektrust.traffic.tracks;

/**
 * The type Orbit 1.
 * Orbit1 implementing Orbit Interface
 */
public class Orbit1 implements Orbit {

  private final String orbitName;
  private final double distanceFromDestination;
  private final int noOfCraters;

  private double orbitSpeed;

  /**
   * Instantiates a new Orbit 1.
   * By default value of orbit1.
   */
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
