package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;
import com.geektrust.traffic.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Rainy implements Weather {
  private String name;
  private int craterAffectedInPercentage;
  private List<Vehicle> vehicleAllowed = new ArrayList<>();

  @Override
  public String getName() {
    return name;
  }

  @Override
  public List<Vehicle> getVehicleAllowed() {
    return vehicleAllowed;
  }

  public Rainy() {
    name = "RAINY";
    craterAffectedInPercentage = 20;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
  }

  @Override
  public int updateCraters(int noOfCraters) {
    int changeInCraters = (int)(noOfCraters * craterAffectedInPercentage) / 100;
    return noOfCraters + changeInCraters;
  }
}
