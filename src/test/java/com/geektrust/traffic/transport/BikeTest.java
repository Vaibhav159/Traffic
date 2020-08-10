package com.geektrust.traffic.transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeTest {

  private Bike bike;

  @BeforeEach
  void setup() {
    bike = new Bike();
  }

  @Test
  void getTimePerCraterTest() {
    assertEquals(2.0, bike.getTimePerCrater());
  }

  @Test
  void bestSpeedForSlowOrbitTest() {
    assertEquals(2, bike.bestSpeedOfVehicle(2));
  }

  @Test
  void bestSpeedForFastOrbitTest() {
    assertEquals(10, bike.bestSpeedOfVehicle(30));
  }


  @Test
  void getVehicleNameTest() {
    assertEquals("BIKE", bike.getVehicleName());
  }

}