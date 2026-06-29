package critical.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1);
        System.out.println(singletonEager2);
        SingletonStaticBlock  singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getInstance();
        System.out.println(singletonStaticBlock1);
        System.out.println(singletonStaticBlock2);
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe1);
        System.out.println(singletonThreadSafe2);
        SingletonDCL singletonDCL1 = SingletonDCL.getInstance();
        SingletonDCL singletonDCL2 = SingletonDCL.getInstance();
        System.out.println(singletonDCL1);
        System.out.println(singletonDCL2);
        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();
        System.out.println(singletonBillPugh1);
        System.out.println(singletonBillPugh2);
    }
}
