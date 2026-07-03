package low.mediator;

/**
 * Colleague Interface
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(String name,
                ChatMediator mediator) {

        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public abstract void receiveMessage(String message);
}
