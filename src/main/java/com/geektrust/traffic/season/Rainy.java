package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Car;
import com.geektrust.traffic.transport.Tuktuk;

/**
 * The type Rainy.
 * Rainy class inheriting the Weather class.
 */
public class Rainy extends Weather {

  /**
   * Instantiates a new Rainy.
   * By default values required in rainy class.
   */
  public Rainy() {
    weatherType = "RAINY";
    craterAffectedInPercentage = 20;
    vehicleAllowed.add(new Car());
    vehicleAllowed.add(new Tuktuk());
    // +ve value shows increasing value.
    increaseInCrater = 1;
  }

}
