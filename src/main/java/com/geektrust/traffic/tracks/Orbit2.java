package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public class Orbit2 implements Orbit{
  private int distanceFromDestination;
  private int noOfCraters;

  public Orbit2() {
    distanceFromDestination = 20;
    noOfCraters = 20;
  }

  @Override
  public void timeTaken() {
  }

  @Override
  public void updateCraters(Weather weather) {
    noOfCraters = weather.updateCraters(noOfCraters);
  }
}
