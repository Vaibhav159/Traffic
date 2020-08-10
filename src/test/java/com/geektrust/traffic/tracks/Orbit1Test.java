package com.geektrust.traffic.tracks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Orbit1Test {

  private Orbit1 orbit1;

  @BeforeEach
  public void setup() {
    orbit1 = new Orbit1();
  }

  @Test
  void getOrbitNameTest() {
    assertEquals("ORBIT1", orbit1.getOrbitName());
  }

  @Test
  void getDistanceFromDestinationTest() {
    assertEquals(18, orbit1.getDistanceFromDestination());
  }

  @Test
  void getCratersTest() {
    assertEquals(20, orbit1.getCraters());
  }

  @Test
  void setAllowedOrbitSpeedTest() {
    double speed = 10;
    orbit1.setAllowedOrbitSpeed(speed);
    assertEquals(speed, orbit1.getAllowedOrbitSpeed());
  }

  @Test
  void getAllowedOrbitSpeedForNoSpeedTest() {
    assertEquals(0, orbit1.getAllowedOrbitSpeed());
  }

  @Test
  void getAllowedOrbitSpeedForSpeedTest() {
    orbit1.setAllowedOrbitSpeed(20);
    assertEquals(20, orbit1.getAllowedOrbitSpeed());
  }


}