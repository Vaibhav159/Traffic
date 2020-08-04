package com.geektrust.traffic.season;

import java.util.Set;

public class Rainy implements Weather {

  private int craterAffectedInPercentage;
  private Set<String> vehicleAllowed;

  public Rainy() {
    craterAffectedInPercentage = 20;
    vehicleAllowed.add("CAR");
    vehicleAllowed.add("TUKTUK");
  }

  @Override
  public int updateCraters(int noOfCraters) {
    int changeInCraters = (int)(noOfCraters * craterAffectedInPercentage) / 100;
    return noOfCraters + changeInCraters;
  }
}
