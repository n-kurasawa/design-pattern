package chapter22_command.command;

import java.util.Stack;

/**
 * Created by naohiro on 2014/01/02.
 */
public class MacroCommand {
    private Stack<Command> commands = new Stack<Command>();

    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    public void undo() {
        if(!commands.isEmpty()) {
            commands.pop();
        }
    }
    public void clear() {
        commands.clear();
    }
}
