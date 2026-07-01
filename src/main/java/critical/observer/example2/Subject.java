package critical.observer.example2;

public interface Subject {
    void subscribe(String event, EventListener listener);
    void unsubscribe(String event, EventListener listener);
    void notifyListeners(String event, String file);
}
