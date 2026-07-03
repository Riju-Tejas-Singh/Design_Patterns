package low.mediator;

/**
 * Mediator Interface
 */
public interface ChatMediator {
    void registerUser(User user);
    void sendMessage(String message, User sender);
}
