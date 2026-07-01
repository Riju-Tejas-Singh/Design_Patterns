package critical.observer.example2;

public class NotificationEventListener implements EventListener{
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Notification Event Listener:: " + eventType + " occurred for file: " + file);
    }
}
