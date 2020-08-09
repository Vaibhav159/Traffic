package com.geektrust.traffic.tracks;

public interface Orbit {
  double getDistanceFromDestination();
  int getCraters();
  void setAllowedOrbitSpeed(double speed);
  double getAllowedOrbitSpeed();
  String getOrbitName();
}
