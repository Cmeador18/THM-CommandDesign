public class RunCommand implements Command{
    
    private Player player;

    public RunCommand(Player player)
    {
        player = this.player;
    }
    public void execute()
    {
        player.runForward();
    }
}
