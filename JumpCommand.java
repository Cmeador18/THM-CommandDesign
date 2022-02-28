/**
 * Class to create a run command
 * 
 * @author Ethan Coarr, Max Van Lokeren, Murray McDaniel, Christian Meador
 * @version 1.0
 */
public class JumpCommand implements Command{

    private Player player;

    /**
     * Initializes internal player object to player passed
     * @param player Player to have run command used on
     */
    public JumpCommand(Player player)
    {
        this.player = player;
    }

    /**
     * Calls jump() on internal player
     */
    public void execute()
    {
        this.player.jump();
    }
    
}
