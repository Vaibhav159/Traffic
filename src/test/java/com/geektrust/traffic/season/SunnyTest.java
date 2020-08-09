package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SunnyTest {

  Weather weather = new Sunny();

  @Test
  public void updateCraterTest() {
    assertEquals(18, weather.updateCraters(20));
  }

  @Test
  public void updateCraterWithDecimalResultTest() {
    assertEquals(16, weather.updateCraters(18));
  }

  @Test
  public void totalVehicleTest() {
    List<Vehicle> vehicles = weather.getVehicleAllowed();
    assertEquals(3, vehicles.size());
    assertEquals("CAR", vehicles.get(0).getVehicleName());
    assertEquals("TUKTUK", vehicles.get(1).getVehicleName());
    assertEquals("BIKE", vehicles.get(2).getVehicleName());
  }

  @Test
  public void weatherTypeTest() {
    assertEquals("SUNNY", weather.getWeatherType());
  }

}