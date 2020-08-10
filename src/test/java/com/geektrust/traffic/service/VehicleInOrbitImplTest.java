package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleForOrbit;
import com.geektrust.traffic.season.Rainy;
import com.geektrust.traffic.season.Sunny;
import com.geektrust.traffic.season.Weather;
import com.geektrust.traffic.season.WeatherFactory;
import com.geektrust.traffic.util.BestVehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VehicleInOrbitImplTest {

  @Mock
  BestVehicle bestVehicle;

  @Mock
  WeatherFactory weatherFactory;

  @InjectMocks
  VehicleInOrbitImpl vehicleInOrbit;

  @BeforeEach
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  void getBestVehicleInRainySeasonTest() {
    String weather = "RAINY";
    IdealVehicleForOrbit expectedVehicle = new IdealVehicleForOrbit(
        "TUKTUK", 10, "ORBIT1", 3);

    when(weatherFactory.createBasedOnWeather(weather)).thenReturn(new Rainy());
    when(bestVehicle.requiredVehicleToBeUsed(any(), any(Weather.class))).thenReturn(expectedVehicle);

    IdealVehicleForOrbit vehicleReceived = vehicleInOrbit
        .getBestVehicle(weather, 10, 10);
    assertEquals(expectedVehicle, vehicleReceived);
    assertEquals("TUKTUK ORBIT1", vehicleReceived.toString());
  }

  @Test
  void getBestVehicleInSunnySeasonTest() {
    String weather = "SUNNY";
    IdealVehicleForOrbit expectedVehicle = new IdealVehicleForOrbit(
        "BIKE", 10, "ORBIT1", 3);

    when(weatherFactory.createBasedOnWeather(weather)).thenReturn(new Sunny());
    when(bestVehicle.requiredVehicleToBeUsed(any(), any(Weather.class))).thenReturn(expectedVehicle);

    IdealVehicleForOrbit vehicleReceived = vehicleInOrbit
        .getBestVehicle(weather, 10, 10);
    assertEquals(expectedVehicle, vehicleReceived);
    assertEquals("BIKE ORBIT1", vehicleReceived.toString());
  }

}