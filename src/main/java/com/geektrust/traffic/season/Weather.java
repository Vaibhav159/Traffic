package com.geektrust.traffic.season;

import com.geektrust.traffic.transport.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Weather.
 * Weather class can be used to
 * inherit other weather classes
 */
public class Weather {
  /**
   * The Weather type.
   * Stores the Type of weather.
   */
  protected String weatherType;
  /**
   * The Crater affected in percentage.
   * Stores the change in percentage due to type of weather.
   */
  protected double craterAffectedInPercentage;
  /**
   * The Increase in crater.
   * Stores 3 types of values :
   *   +ve , -ve , 0 : increase , decrease, same
   */
  protected int increaseInCrater;

  /**
   * The Vehicle allowed.
   * List of Vehicles allowed in the particular Weather.
   */
  protected List<Vehicle> vehicleAllowed = new ArrayList<>();

  /**
   * Gets weather type.
   *
   * @return the weather type
   *     Returns the type of weather it is currently.
   */
  public String getWeatherType() {
    return weatherType;
  }

  /**
   * Update craters int.
   * Calculates the Craters according to the
   * weather type.
   * @param currentCraters the current craters
   *                       in the orbit.
   * @return the int
   *     Returns the change in currentCraters values.
   */
  public int updateCraters(int currentCraters) {
    float changeInCrates = (float) (currentCraters * craterAffectedInPercentage) / 100;
    currentCraters += changeInCrates * increaseInCrater;
    return currentCraters;
  }

  /**
   * Gets vehicle allowed.
   * Returns the vehicles allowed in the current weather Type.
   * @return the vehicle allowed
   */
  public List<Vehicle> getVehicleAllowed() {
    return vehicleAllowed;
  }
}