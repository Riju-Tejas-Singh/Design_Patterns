package critical.singleton;

public class SingletonEager {
    private static final SingletonEager singletonEager = new SingletonEager();
    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
