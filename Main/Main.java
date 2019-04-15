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
        vehicleList.add(new Car(390, "pc"));
        vehicleList.add(new Car(290, "pcc"));
        vehicleList.add(new Car(190, "pc1"));
        vehicleList.add(new Ship());
        vehicleList.add(new Ship(150, "ps"));
        vehicleList.add(new Plane(3200, "pp"));
        vehicleList.add(new Plane());
        vehicleList.add(new Bicycle(55, "bs"));
        vehicleList.add(new Bicycle());

        Program program= new Program(vehicleList);
        program.run();
    }
}