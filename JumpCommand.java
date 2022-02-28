public class JumpCommand implements Command{

    private Player player;

    public JumpCommand(Player player)
    {
        this.player = new Player();
    }
    public void execute()
    {
        this.player.jump();
    }
    
}
