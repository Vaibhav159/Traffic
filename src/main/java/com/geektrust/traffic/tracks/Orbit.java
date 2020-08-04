package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public interface Orbit {
  double getDistanceFromDestination();
  void updateCraters(Weather weather);
  int getCraters();
  void setAllowedOrbitSpeed(double speed);
  double getAllowedOrbitSpeed();
  String getOrbitName();
}
