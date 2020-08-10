package com.geektrust.traffic.transport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuktukTest {

  private Tuktuk tuktuk;

  @BeforeEach
  void setup() {
    tuktuk = new Tuktuk();
  }

  @Test
  void getTimePerCraterTest() {
    assertEquals(1.0, tuktuk.getTimePerCrater());
  }

  @Test
  void bestSpeedForSlowOrbitTest() {
    assertEquals(10, tuktuk.bestSpeed(10));
  }

  @Test
  void bestSpeedForFastOrbitTest() {
    assertEquals(12, tuktuk.bestSpeed(30));
  }


  @Test
  void getVehicleNameTest() {
    assertEquals("TUKTUK", tuktuk.getVehicleName());
  }
}