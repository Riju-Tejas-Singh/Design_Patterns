package low.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Mediator class
 */
public class ChatRoom implements ChatMediator {

    List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream().filter(a -> a != user).forEach(
                a -> a.receiveMessage(message));
    }

}
