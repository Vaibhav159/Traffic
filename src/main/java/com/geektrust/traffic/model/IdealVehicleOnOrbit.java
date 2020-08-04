package com.geektrust.traffic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdealVehicleOnOrbit implements Comparable<IdealVehicleOnOrbit> {
  private String vehicleName;
  private double timeTaken;
  private String orbitName;
  private double timeTakenToClearCrater;

  @Override
  public int compareTo(IdealVehicleOnOrbit idealVehicleOnOrbit) {
    if (this.timeTaken == idealVehicleOnOrbit.timeTaken) {
      return (int) (this.timeTakenToClearCrater - idealVehicleOnOrbit.timeTakenToClearCrater);
    }
    return (int) (this.timeTaken - idealVehicleOnOrbit.timeTaken);
  }

  public String toString() {
    return vehicleName + " " + orbitName;
  }
}
