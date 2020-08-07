package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;
import com.geektrust.traffic.transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Sunny implements Weather{
  private final String name;
  private final int craterAffectedInPercentage;
  private final List<Vehicle> vehicleAllowed = new ArrayList<>();

  @Override
  public String getWeatherName() {
    return name;
  }

  @Override
  public List<Vehicle> getVehicleAllowed() {
    return vehicleAllowed;
  }

  public Sunny() {
    name = "SUNNY";
    craterAffectedInPercentage = 10;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
    vehicleAllowed.add(new Bike());
  }

  @Override
  public int updateCraters(int noOfCraters) {
    int changeInCraters = (noOfCraters * craterAffectedInPercentage) / 100;
    return noOfCraters - changeInCraters;
  }
}
