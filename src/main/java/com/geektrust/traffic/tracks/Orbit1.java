package com.geektrust.traffic.tracks;

public class Orbit1 implements Orbit{
  private int distanceFromDestination;
  private int noOfCraters;

  public Orbit1() {
    distanceFromDestination = 18;
    noOfCraters = 20;
  }

  @Override
  public void timeTaken() {
  }

  @Override
  public void updateCraters(String weather) {
  }
}
