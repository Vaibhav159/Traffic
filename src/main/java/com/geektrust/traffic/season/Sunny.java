package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;

public class Sunny extends Weather{

  public Sunny() {
    weatherType = "SUNNY";
    craterAffectedInPercentage = 10;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
    vehicleAllowed.add(new Bike());
    increaseInCrater = -1;
  }

}
