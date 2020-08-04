package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleOnOrbit;

public interface VehicleInOrbit {
  IdealVehicleOnOrbit getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2);
}
