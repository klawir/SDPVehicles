package Data.Core;
import java.util.Scanner;
import java.util.logging.Logger;

public class Input {

    protected int inputAnswer;
    protected int correctAnswer;
    protected Scanner scanner;
    protected final int minAnswer=1;
    protected final int maxAnswer=6;
    private static Logger logger;

    public  Input()
    {
        scanner = new Scanner(System.in);
        logger = Logger.getLogger(Input.class.getName());
    }
    public void checkRange()
    {
        if(correctAnswer())
            correctAnswer= inputAnswer;
        else
        {
            incorrectData();
            resetCorrectAnswer();
        }
    }
    public void checkDataType()
    {
        System.out.println("your pick: ");
        while (!scanner.hasNextInt())
        {
            incorrectData();
            System.out.println("your pick: ");
            scanner.nextLine();
        }
    }
    private void incorrectData()
    {
        logger.warning("Podaj prawidłową opcję");
    }
    public void enterData()
    {
        inputAnswer = scanner.nextInt();
    }
    private  boolean correctAnswer()
    {
        return inputAnswer >= minAnswer && inputAnswer <= maxAnswer;
    }
    private void resetCorrectAnswer()
    {
        correctAnswer=0;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
