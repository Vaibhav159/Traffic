package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Vehicle;

import java.util.List;

public interface Weather {
  List<Vehicle> getVehicleAllowed();
  String getWeatherName();
  int updateCraters(int noOfCraters);
}
