package Data.UI;

public class Menu {

    public enum answer {
        DEFAULT, CAR, SHIP, PLANE, BICYCLE, ALL, EXIT
    }
    public void display()
    {
        System.out.println("1) CAR");
        System.out.println("2) SHIP");
        System.out.println("3) PLANE");
        System.out.println("4) BICYCLE");
        System.out.println("5) ALL");
        System.out.println("6) EXIT");
    }
}