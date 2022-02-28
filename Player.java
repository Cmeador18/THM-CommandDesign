import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class Player{
    private Scanner scanner;
    
    public Player()
    {

    }
    public void jump()
    {

    }
    public void fire()
    {

    }
    public void runForward()
    {
        scanner = new Scanner("run.txt");
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
