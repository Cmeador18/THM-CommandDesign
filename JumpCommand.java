public class JumpCommand implements Command{

    private Player player;

    public JumpCommand(Player player)
    {
        this.player = player;
    }
    public void execute()
    {
        this.player.jump();
    }
    
}
