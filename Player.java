import java.util.Scanner;
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

    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
    
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
