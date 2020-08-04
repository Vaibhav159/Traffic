package com.geektrust.traffic.transport;

public interface Vehicle {
  void bestSpeed(int speedAllowed);
  boolean canTravel(String weather);
}
