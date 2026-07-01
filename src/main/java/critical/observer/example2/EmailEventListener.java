package critical.observer.example2;

public class EmailEventListener implements EventListener {
    @Override
    public void notify(String eventType, String file) {
        System.out.println("Email Event Listener:: " + eventType + " occurred for file: " + file);
    }
}
