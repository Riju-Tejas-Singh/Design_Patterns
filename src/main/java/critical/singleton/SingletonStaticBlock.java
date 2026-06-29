package critical.singleton;

public class SingletonStaticBlock {
    private static final SingletonStaticBlock instance;
    private  SingletonStaticBlock() {}

    static  {
        instance = new SingletonStaticBlock();
    }
    public static SingletonStaticBlock getInstance() {
        return instance;
    }

}
