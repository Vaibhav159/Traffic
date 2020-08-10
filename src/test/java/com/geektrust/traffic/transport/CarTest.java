package com.geektrust.traffic.transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

  private Car car;

  @BeforeEach
  void setup() {
    car = new Car();
  }

  @Test
  void getTimePerCraterTest() {
    assertEquals(3.0, car.getTimePerCrater());
  }

  @Test
  void bestSpeedForSlowOrbitTest() {
    assertEquals(4, car.bestSpeed(4));
  }

  @Test
  void bestSpeedForFastOrbitTest() {
    assertEquals(20, car.bestSpeed(30));
  }


  @Test
  void getVehicleNameTest() {
    assertEquals("CAR", car.getVehicleName());
  }
}