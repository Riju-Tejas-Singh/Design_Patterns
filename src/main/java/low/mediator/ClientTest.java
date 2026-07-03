package low.mediator;

public class ClientTest {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User p1 = new ChatUser("ABC", mediator);
        User p2 = new ChatUser("DEF", mediator);
        User p3 = new ChatUser("GHI", mediator);

        mediator.registerUser(p1);
        mediator.registerUser(p2);
        mediator.registerUser(p3);

        p1.send("I am running.");
        p2.send("I am studying.");
    }
    //    DEF received -> I am running.
    //    GHI received -> I am running.
    //    ABC received -> I am studying.
    //    GHI received -> I am studying.
}
