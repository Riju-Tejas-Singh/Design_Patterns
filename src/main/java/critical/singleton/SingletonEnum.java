package critical.singleton;

/**
 * Thread safe but Eager, avoids Cloning, Reflection & Serialization problems
 */
public enum SingletonEnum {
    INSTANCE;

    public void doWork() {
        System.out.println("Doing some work...");
    }

    /*
    Test using :
    Singleton singleton = Singleton.INSTANCE;
    singleton.doWork();
     */

}
