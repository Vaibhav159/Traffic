package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Vehicle;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RainyTest {

  Weather weather = new Rainy();

  @Test
  public void updateCraterTest() {
    assertEquals(24, weather.updateCraters(20));
  }

  @Test
  public void updateCraterWithDecimalResultTest() {
    assertEquals(21, weather.updateCraters(18));
  }

  @Test
  public void totalVehicleTest() {
    List<Vehicle> vehicles = weather.getVehicleAllowed();
    assertEquals("CAR", vehicles.get(0).getVehicleName());
    assertEquals("TUKTUK", vehicles.get(1).getVehicleName());
  }

  @Test
  public void weatherTypeTest() {
    assertEquals("RAINY", weather.getWeatherType());
  }

}