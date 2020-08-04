package com.geektrust.traffic.transport;

import java.util.Set;

public class Car implements Vehicle{
  private int maxSpeed;
  private int timePerCrater;
  private Set<String> weatherRequired;

  public Car() {
    maxSpeed = 20;
    timePerCrater = 3;
    weatherRequired.add("RAINY");
    weatherRequired.add("SUNNY");
    weatherRequired.add("WINDY");
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
