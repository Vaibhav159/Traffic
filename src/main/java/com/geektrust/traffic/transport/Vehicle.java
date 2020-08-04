package com.geektrust.traffic.transport;

public interface Vehicle {

  double getTimePerCrater();

  String getVehicleName();

  double bestSpeed(double speedAllowed);
}
