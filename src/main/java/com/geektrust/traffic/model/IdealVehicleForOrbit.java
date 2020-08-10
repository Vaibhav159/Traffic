package com.geektrust.traffic.model;

import lombok.*;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IdealVehicleForOrbit implements Comparable<IdealVehicleForOrbit> {

  private String vehicleName;

  @Getter(AccessLevel.NONE)
  private double timeTaken;

  private String orbitName;

  @Getter(AccessLevel.NONE)
  private double timeTakenToClearCrater;

  @Override
  public int compareTo(IdealVehicleForOrbit idealVehicleForOrbit) {
    if (this.timeTaken == idealVehicleForOrbit.timeTaken) {
      return (int) (this.timeTakenToClearCrater - idealVehicleForOrbit.timeTakenToClearCrater);
    }
    return (int) (this.timeTaken - idealVehicleForOrbit.timeTaken);
  }

  public String toString() {
    return vehicleName + " " + orbitName;
  }
}
