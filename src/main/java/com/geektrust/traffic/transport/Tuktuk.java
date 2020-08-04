package com.geektrust.traffic.transport;

import java.util.Set;

public class Tuktuk implements Vehicle{

  private int maxSpeed;
  private int timePerCrater;
  private Set<String> weatherRequired;

  public Tuktuk() {
    maxSpeed = 12;
    timePerCrater = 1;
    weatherRequired.add("RAINY");
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
