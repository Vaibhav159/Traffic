package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Weather {
  protected String weatherType;
  protected double craterAffectedInPercentage;
  protected int increaseInCrater;

  protected List<Vehicle> vehicleAllowed = new ArrayList<>();

  public String getWeatherType() {
    return weatherType;
  }

  public int updateCraters(int currentCraters) {
    float changeInCrates = (float) (currentCraters * craterAffectedInPercentage) / 100;
    currentCraters += changeInCrates * increaseInCrater;
    return currentCraters;
  }

  public List<Vehicle> getVehicleAllowed() {
    return vehicleAllowed;
  }
}