package high.state;

public class HasMoneyState implements State{
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("coin already inserted");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("selecting product");
        machine.setNextState(new DispenseState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("select product first");
    }
}
