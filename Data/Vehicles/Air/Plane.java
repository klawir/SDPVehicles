package Data.Vehicles.Air;

import Data.Vehicles.Core.Vehicle;

public class Plane extends Vehicle {
    public Plane() {
        speed=400;
        production="a producer";
    }
    public Plane(int  speed, String production) {
        super(speed, production);
    }

    @Override
    public String toString() {
        return "Samolot "+super.toString();
    }
}
