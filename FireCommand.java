/**
 * Class to create a fire command
 * 
 * @author Ethan Coarr, Max Van Lokeren, Murray McDaniel, Christian Meador
 * @version 1.0
 */
public class FireCommand implements Command{

    private Player player;

    /**
     * Initializes internal player object to player passed
     * @param player Player to have run command used on
     */
    public FireCommand(Player player)
    {
        this.player = player;
    }
    
    /**
     * Calls fire() on internal player
     */
    public void execute()
    {
        this.player.fire();
    }
}