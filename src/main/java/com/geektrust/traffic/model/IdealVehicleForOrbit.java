package com.geektrust.traffic.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Ideal vehicle for orbit.
 * The dto class for holding the data
 */
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdealVehicleForOrbit implements Comparable<IdealVehicleForOrbit> {

  private String vehicleName;

  // only be used to set value of timeTaken
  @Getter(AccessLevel.NONE)
  private double timeTaken;

  private String orbitName;

  // only be used to set value of timeTakenToClearCrater
  @Getter(AccessLevel.NONE)
  private double timeTakenToClearCrater;

  /**
   * compare To.
   * Used to compare two objects of IdealVehicleForOrbit class.
   * @param idealVehicleForOrbit compares it with current object.
   * @return
   *     returns +ve, -ve , 0 based on the values of two objects
   *     +ve implies current obj > obj received
   *     0 implies current obj = obj received
   *     -ve implies current obj < obj received
   */
  @Override
  public int compareTo(IdealVehicleForOrbit idealVehicleForOrbit) {
    if (this.timeTaken == idealVehicleForOrbit.timeTaken) {
      return (int) (this.timeTakenToClearCrater - idealVehicleForOrbit.timeTakenToClearCrater);
    }
    return (int) (this.timeTaken - idealVehicleForOrbit.timeTaken);
  }

  /**
   * To String.
   * Converts the object data into String format.
   * @return
   *     returns the only required field.
   */
  public String toString() {
    return vehicleName + " " + orbitName;
  }
}
