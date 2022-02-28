import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class Player{
    private Scanner scanner;
    
    /**
     * Initializes player and prints out birth
     */
    public Player()
    {
        System.out.println("Our hero is born");
    }

    /**
     * Prints out jump animation stored in jump.txt
     */
    public void jump()
    {
        try {
            this.scanner = new Scanner(new File("jump.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.printAnimation(6);
    }
    
    /**
     * Prints out fire animation stored in fire.txt
     */
    public void fire()
    {
        try {
            this.scanner = new Scanner(new File("fire.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.printAnimation(3);
    }

    /**
     * Prints out run animation stored in run.txt
     */
    public void runForward()
    {
        try {
            scanner = new Scanner(new File("run.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        printAnimation(3);
    }

    /**
     * Private helper function that sleeps the thread for specified amount
     * @param num Amount in milliseconds to put thread to sleep
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    /**
     * Clears the console with special escape sequence
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
    
    /**
     * Private helper function that prints out an animation
     * @param numOfLines Number of lines animation lasts before changing
     */
    private void printAnimation(int numOfLines) {
        while(scanner.hasNextLine()) {
            for (int i = 0; i < numOfLines; i++) {
                System.out.println(scanner.nextLine());
            }
            sleep(100);
            clear();
        }
    }
}
