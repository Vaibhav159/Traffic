package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;

public class Windy extends Weather{

  public Windy() {
    weatherType = "WINDY";
    craterAffectedInPercentage = 0;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Bike());
    increaseInCrater = 0;
  }

}
