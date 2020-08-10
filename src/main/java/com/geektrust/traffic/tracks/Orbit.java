package com.geektrust.traffic.tracks;

/**
 * The interface Orbit.
 */
public interface Orbit {
  /**
   * Gets distance from destination.
   * Returns the distance from source
   * to destination.
   * @return the distance from destination
   */
  double getDistanceFromDestination();

  /**
   * Gets craters.
   * Returns total number of craters
   * in the Orbit.
   * @return the craters
   */
  int getCraters();

  /**
   * Sets allowed orbit speed.
   * Sets the max allowed speed for
   * a particular orbit
   * @param speed the speed
   *              MaxSpeed given by the user
   */
  void setAllowedOrbitSpeed(double speed);

  /**
   * Gets allowed orbit speed.
   * Gets the Max speed allowed in the orbit.
   * @return the allowed orbit speed
   */
  double getAllowedOrbitSpeed();

  /**
   * Gets orbit name.
   * Gets the orbit Name
   * @return the orbit name
   */
  String getOrbitName();
}
