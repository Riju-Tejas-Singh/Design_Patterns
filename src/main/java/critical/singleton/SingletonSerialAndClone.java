package critical.singleton;

import java.io.Serializable;

/**
 * Implementing readResolve and clone methods to prevent serialization and cloning
 */
public class SingletonSerialAndClone implements Serializable, Cloneable {

    private static volatile SingletonSerialAndClone  SingletonSerialAndClone ;
    private SingletonSerialAndClone () {}

    public static SingletonSerialAndClone  getInstance() {
        if (SingletonSerialAndClone  == null) {
            synchronized (SingletonSerialAndClone .class) {
                if (SingletonSerialAndClone  == null) {
                    SingletonSerialAndClone  = new SingletonSerialAndClone ();
                }
            }
        }
        return SingletonSerialAndClone ;
    }

    /**
     * resolve serialization issues
     */
    public Object readResolve() {
        return SingletonSerialAndClone ;
    }

    /**
     * avoid cloning
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
