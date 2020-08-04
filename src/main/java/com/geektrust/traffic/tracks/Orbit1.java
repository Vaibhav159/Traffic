package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

import java.util.List;

public class Orbit1 implements Orbit{
  private int distanceFromDestination;
  private int noOfCraters;
  private List<Weather> weathers;

  public Orbit1() {
    distanceFromDestination = 18;
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
