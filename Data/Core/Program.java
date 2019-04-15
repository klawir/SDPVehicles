package Data.Core;

import Data.UI.Menu;
import Data.Vehicles.Air.Plane;
import Data.Vehicles.Core.Vehicle;
import Data.Vehicles.Ground.Bicycle;
import Data.Vehicles.Ground.Car;
import Data.Vehicles.Water.Ship;

import java.util.*;
import java.util.logging.Logger;


public class Program {

    private Menu menu;
    private List vehicleList;
    private ListManager listManager;
    private Menu.answer answer;
    private Input input;
    private static Logger logger;

    public Program(List list)
    {
        menu= new Menu();
        this.vehicleList =new ArrayList<Vehicle>();
        this.vehicleList =list;
        listManager= new ListManager(vehicleList);
        input =new Input();
        logger = Logger.getLogger(Input.class.getName());
    }

    public void run()
    {
        loop();
    }
    private void result()
    {
        answer = Menu.answer.values()[input.getCorrectAnswer()];
        switch (answer)
        {
            case CAR:
                listManager.displayTheFastest(new Car());
                break;
            case SHIP:
                listManager.displayTheFastest(new Ship());
                break;
            case PLANE:
                listManager.displayTheFastest(new Plane());
                break;
            case BICYCLE:
                listManager.displayTheFastest(new Bicycle());
                break;
            case ALL:
                listManager.displayAll();
                break;
            case EXIT:
                exit();
                break;
        }
    }
    public void choose() {

        input.checkDataType();
        input.enterData();
        input.checkRange();
    }
    private void loop()
    {
        while (true)
        {
            menu.display();
            choose();
            result();
        }
    }
    private void exit()
    {
        logger.info("Application is closing...");
        System.exit(0);
    }
}