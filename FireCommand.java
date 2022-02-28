public class FireCommand implements Command{

    private Player player;

    public FireCommand(Player player)
    {
        this.player = new Player();
    }
    public void execute()
    {
        this.player.fire();
    }
}