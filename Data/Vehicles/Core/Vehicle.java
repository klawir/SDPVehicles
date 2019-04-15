package Data.Vehicles.Core;

public abstract class Vehicle {
    protected int speed;
    protected String production;

    public Vehicle() {

    }
    public Vehicle(int speed, String production) {
        this.speed = speed;
        this.production = production;
    }
    public String toString() {
        return " producenta "+production+ " jest najszybszy (maksymalna prędkość to="+speed+")";
    }
    public int getSpeed() {
        return speed;
    }
}
