package critical.observer.example1;

/**
 * Not used anywhere but good to map to interface
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
