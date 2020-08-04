package com.geektrust.traffic.season;

import java.util.Set;

public class Windy implements Weather{
  private int craterAffectedInPercentage;
  private Set<String> vehicleAllowed;

  public Windy() {
    craterAffectedInPercentage = 0;
    vehicleAllowed.add("CAR");
    vehicleAllowed.add("BIKE");
  }

  @Override
  public int updateCraters(int noOfCraters) {
    return noOfCraters;
  }
}
