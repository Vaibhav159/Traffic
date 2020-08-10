package com.geektrust.traffic;

import com.geektrust.traffic.model.IdealVehicleForOrbit;
import com.geektrust.traffic.service.VehicleInOrbit;
import com.geektrust.traffic.service.VehicleInOrbitImpl;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * The type Traffic application.
 * The main driver class
 */
public class TrafficApplication {
  private String weather;
  private Integer maxSpeedAtOrbit1;
  private Integer maxSpeedAtOrbit2;
  private final VehicleInOrbit vehicleInOrbit;

  /**
   * Instantiates a new Traffic application.
   */
  public TrafficApplication() {
    vehicleInOrbit = new VehicleInOrbitImpl();
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   *             here args will be the path of the
   *             input file
   */
  public static void main(String[] args) {

    TrafficApplication trafficApplication = new TrafficApplication();

    //Try catch block to check if file exists or not
    try {
      trafficApplication.populateValues(args[0]);
      trafficApplication.findVehicleWithOrbit();
    } catch (IOException e) {
      System.out.println("ERROR :" + e.getMessage());
      e.printStackTrace();
    }

  }

  //Prints the final ans by the vehicle required with orbit
  private void findVehicleWithOrbit() {

    IdealVehicleForOrbit idealVehicleForOrbit = vehicleInOrbit
        .getBestVehicle(weather, maxSpeedAtOrbit1, maxSpeedAtOrbit2);

    //prints out the idealVehicleForOrbit
    System.out.println(idealVehicleForOrbit.toString());
  }

  //populates the value of weather, maxSpeedAtOrbit1 and maxSpeedAtOrbit2
  //with the values given in file
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
