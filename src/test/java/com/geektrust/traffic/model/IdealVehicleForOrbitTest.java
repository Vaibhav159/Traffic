package com.geektrust.traffic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdealVehicleForOrbitTest {

  private IdealVehicleForOrbit vehicle1;
  private IdealVehicleForOrbit vehicle2;

  @Test
  void carAndBikeTest() {
    vehicle1 = new IdealVehicleForOrbit(
        "BIKE", 20, "ORBIT1", 1);
    vehicle2 = new IdealVehicleForOrbit(
        "CAR", 10, "ORBIT1", 3);

    assertEquals(10, vehicle1.compareTo(vehicle2));
  }

  @Test
  void carAndBikeEqualSpeedTest() {
    vehicle1 = new IdealVehicleForOrbit(
        "BIKE", 10, "ORBIT1", 1);
    vehicle2 = new IdealVehicleForOrbit(
        "CAR", 10, "ORBIT1", 3);

    assertEquals(-2, vehicle1.compareTo(vehicle2));
  }

  @Test
  void bikeAndTukTukEqualSpeedTest() {
    vehicle1 = new IdealVehicleForOrbit(
        "BIKE", 10, "ORBIT1", 1);
    vehicle2 = new IdealVehicleForOrbit(
        "TUKTUK", 10, "ORBIT1", 2);

    assertEquals(-1, vehicle1.compareTo(vehicle2));
  }

  @Test
  void carAndTukTukEqualSpeedTest() {
    vehicle1 = new IdealVehicleForOrbit(
        "CAR", 10, "ORBIT1", 3);
    vehicle2 = new IdealVehicleForOrbit(
        "TUKTUK", 10, "ORBIT1", 2);

    assertEquals(1, vehicle1.compareTo(vehicle2));
  }

  @Test
  void toStringTest() {
    vehicle1 = new IdealVehicleForOrbit(
        "CAR", 10, "ORBIT1", 3);

    assertEquals("CAR ORBIT1", vehicle1.toString());
  }

  @Test
  void toStringEmptyTest() {
    assertThrows(NullPointerException.class,() -> vehicle1.toString());
  }

}