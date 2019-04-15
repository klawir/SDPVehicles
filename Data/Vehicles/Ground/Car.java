package Data.Vehicles.Ground;

import Data.Vehicles.Core.Vehicle;

public class Car extends Vehicle {
    public Car() {
        speed = 100;
        production = "a producer";
    }
    public Car(int speed, String production) {
        super(speed, production);
    }

    @Override
    public String toString() {
        return "Samochód "+super.toString();
    }
}
