/**
 * Class to create a quit command
 * 
 * @author Ethan Coarr, Max Van Lokeren, Murray McDaniel, Christian Meador
 * @version 1.0
 */
public class QuitCommand implements Command{

    private Player player;

    /**
     * Initializes internal player object to player passed
     * @param player Player to have run command used on
     */
    public QuitCommand(Player player)
    {
        player = this.player;
    }

    /**
     * Prints out game over when called
     */
    public void execute()
    {
        System.out.println("Game over");
    }
}
