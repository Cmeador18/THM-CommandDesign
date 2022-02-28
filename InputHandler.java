import java.util.HashMap;

/**
 * Creates an input handler that stores various commands and the string key words related to them
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * Stores each command and associated string keyword in a hash map
     * @param player Player object that the commands will be called on
     */
    public InputHandler(Player player) {
        commands = new HashMap<String, Command>();
        commands.put("jump", new JumpCommand(player));
        commands.put("run", new RunCommand(player));
        commands.put("fire", new FireCommand(player));
        commands.put("quit", new QuitCommand(player));
    }

    /**
     * Executes command associated with input string on internal player
     * @param button String command to be executed
     */
    public void buttonPressed(String button) {
        commands.get(button).execute();
    }
}