package com.geektrust.traffic.tracks;

import com.geektrust.traffic.season.Weather;

public interface Orbit {
  void timeTaken();
  void updateCraters(Weather weather);
}
