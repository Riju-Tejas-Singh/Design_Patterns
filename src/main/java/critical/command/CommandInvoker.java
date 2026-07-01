package critical.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker : eg Remote Control to invoke any commands in any order
 */
public class CommandInvoker {
    private final List<Command> history = new ArrayList<>();
    private final List<Command> undoHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.remove(history.size() - 1);
            command.undo();
            undoHistory.add(command);
        }
    }

    public void redo() {
        if (!undoHistory.isEmpty()) {
            Command command = undoHistory.remove(undoHistory.size() - 1);
            command.execute();
            history.add(command);
        }
    }
}
