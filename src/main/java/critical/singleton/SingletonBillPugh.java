package critical.singleton;

/**
 * Lazy and thread safe at the same time since
 */
public class SingletonBillPugh {
    private  SingletonBillPugh() {}

    /**
     * Thread safe because this class can only be loaded once (lazy) and by one thread at a time
     */
    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
