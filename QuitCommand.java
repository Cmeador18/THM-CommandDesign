public class QuitCommand implements Command{

    private Player player;


    public QuitCommand(Player player)
    {
        player = this.player;
    }
    public void execute()
    {
        System.out.println("Quit");
    }
}
