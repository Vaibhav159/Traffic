package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Bike;
import com.geektrust.traffic.transport.Car;

/**
 * The type Windy.
 * Windy class inheriting the Weather class.
 */
public class Windy extends Weather {

  /**
   * Instantiates a new Windy.
   * By default values required in Windy class.
   */
  public Windy() {
    weatherType = "WINDY";
    craterAffectedInPercentage = 0;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Bike());
    // 0 implies no change in Crater.
    increaseInCrater = 0;
  }

}
