package critical.observer.example2;

/**
 * Observer
 */
public interface EventListener {
    void notify(String eventType, String file);
}
