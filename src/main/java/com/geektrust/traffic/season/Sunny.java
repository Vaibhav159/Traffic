package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;

/**
 * The type Sunny.
 * Sunny class inheriting the Weather class.
 */
public class Sunny extends Weather {

  /**
   * Instantiates a new Sunny.
   * By default values required in Sunny class.
   */
  public Sunny() {
    weatherType = "SUNNY";
    craterAffectedInPercentage = 10;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
    vehicleAllowed.add(new Bike());
    // -ve value shows decrease in Crater
    increaseInCrater = -1;
  }

}
