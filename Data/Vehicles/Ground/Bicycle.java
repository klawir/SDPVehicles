package Data.Vehicles.Ground;

import Data.Vehicles.Core.Vehicle;

public class Bicycle extends Vehicle {

    public Bicycle() {
        speed=50;
        production="a producer";
    }
    public Bicycle(int  speed, String production) {
        super(speed, production);
    }

    @Override
    public String toString() {
        return "Rower "+super.toString();
    }
}
