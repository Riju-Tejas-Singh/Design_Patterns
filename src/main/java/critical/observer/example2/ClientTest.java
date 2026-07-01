package critical.observer.example2;

public class ClientTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EmailEventListener emailListener = new EmailEventListener();
        NotificationEventListener logListener = new NotificationEventListener();

        editor.events.subscribe("open", emailListener);
        editor.events.subscribe("save", emailListener);
        editor.events.subscribe("open", logListener);

        editor.openFile("test.jpg");
        editor.saveFile();

        System.out.println();

        editor.events.unsubscribe("save", emailListener);

        editor.openFile("test1.jpg");
        editor.saveFile();
    }

    //    Email Event Listener:: open occurred for file: test.jpg
    //    Notification Event Listener:: open occurred for file: test.jpg
    //    Email Event Listener:: save occurred for file: test.jpg
    //
    //    Email Event Listener:: open occurred for file: test1.jpg
    //    Notification Event Listener:: open occurred for file: test1.jpg
}
