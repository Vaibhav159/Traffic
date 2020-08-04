package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Windy implements Weather{
  private String name;
  private int craterAffectedInPercentage;
  private List<Vehicle> vehicleAllowed = new ArrayList<>();

  public List<Vehicle> getVehicleAllowed() {
    return vehicleAllowed;
  }

  @Override
  public String getName() {
    return name;
  }

  public Windy() {
    name = "WINDY";
    craterAffectedInPercentage = 0;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Bike());
  }

  @Override
  public int updateCraters(int noOfCraters) {
    return noOfCraters;
  }
}
