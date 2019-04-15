package Data.Core;

import Data.Vehicles.Air.Plane;
import Data.Vehicles.Ground.Bicycle;
import Data.Vehicles.Ground.Car;
import Data.Vehicles.Water.Ship;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class ListManager {

    private List vehicleList;

    private List planeList;
    private List bicycleList;
    private List shipList;
    private List carList;
    private static Logger logger;

    public ListManager(List list)
    {
        vehicleList= new ArrayList();
        vehicleList=list;

        carList=new ArrayList<Car>();
        planeList=new ArrayList<Plane>();
        bicycleList=new ArrayList<Bicycle>();
        shipList=new ArrayList<Ship>();
        logger = Logger.getLogger(ListManager.class.getName());

        copy();
        sort();
    }

    private void  displayAllLog() {
        logger.info("printing all most fastest vehicles...");
    }
    private  void sort()
    {
        carList.sort(new Comparator<Car>() {
            @Override public int compare(Car p1, Car p2) {
                return p1.getSpeed() - p2.getSpeed();
            }
        });
        planeList.sort(new Comparator<Plane>() {
            @Override public int compare(Plane p1, Plane p2) {
                return p1.getSpeed() - p2.getSpeed();
            }
        });
        bicycleList.sort(new Comparator<Bicycle>() {
            @Override public int compare(Bicycle p1, Bicycle p2) {
                return p1.getSpeed() - p2.getSpeed();
            }
        });
        shipList.sort(new Comparator<Ship>() {
            @Override public int compare(Ship p1, Ship p2) {
                return p1.getSpeed() - p2.getSpeed();
            }
        });
    }
    public void displayAll()
    {
        displayAllLog();
        System.out.println(carList.get(carList.size()-1));
        System.out.println(planeList.get(planeList.size()-1));
        System.out.println(bicycleList.get(bicycleList.size()-1));
        System.out.println(shipList.get(shipList.size()-1));
    }
    public void displayTheFastest(Car car)
    {
        simpleChooseInfo("car");
        System.out.println(carList.get(carList.size()-1));
    }
    public void displayTheFastest(Plane plane)
    {
        simpleChooseInfo("plane");
        System.out.println(planeList.get(planeList.size()-1));
    }
    public void displayTheFastest(Bicycle bicycle)
    {
        simpleChooseInfo("bicycle");
        System.out.println(bicycleList.get(bicycleList.size()-1));
    }
    public void displayTheFastest(Ship ship)
    {
        simpleChooseInfo("ship");
        System.out.println(shipList.get(shipList.size()-1));
    }

    private void simpleChooseInfo(String vehicleType)
    {
        logger.info("printing most fastest "+vehicleType+"... ");
    }

    private void copy()
    {
        for(Object o : vehicleList) {
            if (o instanceof Plane)
                planeList.add(o);
            else if (o instanceof Bicycle)
                bicycleList.add(o);
            else if (o instanceof Ship)
                shipList.add(o);
            else if (o instanceof Car)
                carList.add(o);
        }
    }
}
