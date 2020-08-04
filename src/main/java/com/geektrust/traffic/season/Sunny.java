package com.geektrust.traffic.season;

import java.util.Set;

public class Sunny implements Weather{
  private int craterAffectedInPercentage;
  private Set<String> vehicleAllowed;

  public Sunny() {
    craterAffectedInPercentage = 10;
    vehicleAllowed.add("CAR");
    vehicleAllowed.add("TUKTUK");
    vehicleAllowed.add("BIKE");
  }

  @Override
  public int updateCraters(int noOfCraters) {
    int changeInCraters = (int)(noOfCraters * craterAffectedInPercentage) / 100;
    return noOfCraters - changeInCraters;  }
}
