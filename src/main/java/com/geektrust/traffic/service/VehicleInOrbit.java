package com.geektrust.traffic.service;

import com.geektrust.traffic.model.IdealVehicleForOrbit;

public interface VehicleInOrbit {
  IdealVehicleForOrbit getBestVehicle(String weather, int maxSpeedAtOrbit1, int maxSpeedAtOrbit2);
}
