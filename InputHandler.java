import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Player player) {
        commands = new HashMap<String, Command>();
        commands.put("jump", new JumpCommand(player));
        commands.put("run", new RunCommand(player));
        commands.put("fire", new FireCommand(player));
        commands.put("quit", new QuitCommand(player));
    }

    public void buttonPressed(String button) {
        commands.get(button).execute();
    }
}