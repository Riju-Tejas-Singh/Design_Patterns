package critical.singleton;

/**
 * Double-checked locking
 */
public class SingletonDCL {
    /**
     * make it volatile
     */
    private static volatile SingletonDCL singletonDCL;

    private SingletonDCL() {
    }

    /**
     * only acquire lock when instance is null
     */
    public static SingletonDCL getInstance() {
        // first check
        if (singletonDCL == null) {
            synchronized (SingletonDCL.class) {
                // double check in case 1st thread initializes instance
                if (singletonDCL == null) {
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
