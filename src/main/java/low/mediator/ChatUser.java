package low.mediator;

/**
 * Concrete Colleague Class
 */
public class ChatUser extends User {

    public ChatUser(String name, ChatMediator mediator) {

        super(name, mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received -> " + message);
    }
}
