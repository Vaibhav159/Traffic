package com.geektrust.traffic;

import com.geektrust.traffic.model.IdealVehicleOnOrbit;
import com.geektrust.traffic.service.VehicleInOrbit;
import com.geektrust.traffic.service.VehicleInOrbitImpl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TrafficApplication {
  private String weather;
  private Integer maxSpeedAtOrbit1;
  private Integer maxSpeedAtOrbit2;

  public static void main(String[] args) {
    TrafficApplication trafficApplication = new TrafficApplication();
    try {
      trafficApplication.getResult(args[0]);
    }
    catch (IOException e) {
      System.out.println("ERROR :" + e.getMessage());
      e.printStackTrace();
    }

  }

  private void getResult(String filepath) throws IOException {
    populateValues(filepath);
    VehicleInOrbit vehicleInOrbit = new VehicleInOrbitImpl();
    IdealVehicleOnOrbit idealVehicleOnOrbit = vehicleInOrbit
        .getBestVehicle(weather, maxSpeedAtOrbit1, maxSpeedAtOrbit2);

    String ans = idealVehicleOnOrbit.toString();
    System.out.println(ans);
  }

  private void populateValues(String filepath) throws IOException {
    Path path = Paths.get(filepath);
    Scanner scanner = new Scanner(path);

    if (scanner.hasNextLine()) {
      weather = scanner.next();
      maxSpeedAtOrbit1 = scanner.nextInt();
      maxSpeedAtOrbit2 = scanner.nextInt();
    }
  }
}
