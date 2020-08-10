package com.geektrust.traffic.tracks;

/**
 * The type Orbit 2.
 * Orbit2 implementing Orbit Interface
 */
public class Orbit2 implements Orbit {

  private final String orbitName;
  private final double distanceFromDestination;
  private final int noOfCraters;
  private double orbitSpeed;

  /**
   * Instantiates a new Orbit 2.
   * By default value of orbit2.
   */
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
