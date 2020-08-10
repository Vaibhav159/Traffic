package com.geektrust.traffic.util;

import com.geektrust.traffic.model.IdealVehicleForOrbit;
import com.geektrust.traffic.season.Sunny;
import com.geektrust.traffic.tracks.Orbit;
import com.geektrust.traffic.tracks.Orbit1;
import com.geektrust.traffic.tracks.Orbit2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestVehicleTest {

  private final BestVehicle bestVehicle;
  private final List<Orbit> orbits;
  private IdealVehicleForOrbit vehicleReceived;

  public BestVehicleTest() {
    orbits = new ArrayList<>();
    bestVehicle = new BestVehicle();
    orbits.add(new Orbit1());
    orbits.add(new Orbit2());
  }

  @Test
  void requiredVehicleForTwoOrbitTest() {
    orbits.get(0).setAllowedOrbitSpeed(10);
    orbits.get(1).setAllowedOrbitSpeed(15);
    vehicleReceived = bestVehicle.requiredVehicleToBeUsed(orbits, new Sunny());
    assertEquals("CAR ORBIT2", vehicleReceived.toString());
  }

  @Test
  void requiredVehicleForOneOrbitTest() {
    orbits.get(0).setAllowedOrbitSpeed(10);
    vehicleReceived = bestVehicle.requiredVehicleToBeUsed(orbits, new Sunny());
    assertEquals("TUKTUK ORBIT1", vehicleReceived.toString());
  }

  @Test
  void requiredVehicleForNoOrbitTest() {
    vehicleReceived = bestVehicle.requiredVehicleToBeUsed(orbits, new Sunny());
    assertEquals("null null", vehicleReceived.toString());
  }
}