package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;

public class Rainy extends Weather {


  public Rainy() {
    weatherType = "RAINY";
    craterAffectedInPercentage = 20;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
    increaseInCrater = 1;
  }

}
