package medium.command;

/**
 * Command interface : stores all commands to be invoked by invoker and received by receiver
 */
public interface Command {
    void execute();
    void undo();
}
