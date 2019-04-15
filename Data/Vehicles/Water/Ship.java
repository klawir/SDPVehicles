package Data.Vehicles.Water;

import Data.Vehicles.Core.Vehicle;

public class Ship extends Vehicle {

    public Ship() {
        speed=120;
        production="a producer";
    }
    public Ship(int  speed, String production) {
        super(speed, production);
    }

    @Override
    public String toString() {
        return "Statek "+super.toString();
    }
}
