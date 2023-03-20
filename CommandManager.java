import java.util.Stack;
public class CommandManager {
    private Stack<Command> executedCommands;
    public CommandManager() {
        executedCommands = new Stack<>();
    }
    
    public void executeCommand(Command command) {
        command.execute();
        executedCommands.push(command);
    }
    
    public void undo() {
        if (!executedCommands.isEmpty()) {
            Command command = executedCommands.pop();
            command.undo();
        }
    }    
}
