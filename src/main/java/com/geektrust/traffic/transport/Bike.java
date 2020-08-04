package com.geektrust.traffic.transport;

import java.util.Set;

public class Bike implements Vehicle{
  private int maxSpeed;
  private int timePerCrater;
  private Set<String> weatherRequired;

  public Bike() {
    maxSpeed = 10;
    timePerCrater = 2;
    weatherRequired.add("WINDY");
    weatherRequired.add("SUNNY");
  }

  @Override
  public void bestSpeed(int speedAllowed) {
    maxSpeed = Math.min(maxSpeed, speedAllowed);
  }

  @Override
  public boolean canTravel(String weather) {
    if (weatherRequired.contains(weather))
      return true;
    return false;
  }

}
