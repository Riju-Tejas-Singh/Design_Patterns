package critical.observer.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Subject class
 */
public class EventManager implements Subject{
    Map<String, ArrayList<EventListener>> listeners = new HashMap<>();

    public EventManager(String ... operations) {
        for (String op : operations) {
            listeners.put(op, new ArrayList<>());
        }
    }

    @Override
    public void subscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        if (!users.contains(listener)) {
            users.add(listener);
        }
    }

    @Override
    public void unsubscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        users.remove(listener);
    }

    @Override
    public void notifyListeners(String event, String file) {
        ArrayList<EventListener> users = listeners.get(event);
        for (EventListener user : users) {
            user.notify(event, file);
        }
    }
}
