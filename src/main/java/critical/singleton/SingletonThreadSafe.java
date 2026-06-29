package critical.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe() {}

    /**
     * acquires lock on entire method
     */
    synchronized public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
