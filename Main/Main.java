package Main;

import Data.Core.Program;
import Data.Vehicles.Air.Plane;
import Data.Vehicles.Core.Vehicle;
import Data.Vehicles.Ground.Bicycle;
import Data.Vehicles.Ground.Car;
import Data.Vehicles.Water.Ship;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        List vehicleList=new ArrayList<Vehicle>();

        vehicleList.add(new Car());
        vehicleList.add(new Car(463, "Bugatti"));
        vehicleList.add(new Car(290, "Lamborgini"));
        vehicleList.add(new Car(200, "BMW"));
        vehicleList.add(new Ship());
        vehicleList.add(new Ship(104, "HSC"));
        vehicleList.add(new Plane(956, "Boeing"));
        vehicleList.add(new Plane());
        vehicleList.add(new Bicycle(210, "Intense"));
        vehicleList.add(new Bicycle());

        Program program= new Program(vehicleList);
        program.run();
    }
}