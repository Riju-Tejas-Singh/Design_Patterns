package high.state;

public class IdleState implements State{
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("inserting coin");
        machine.setNextState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("insert coin first");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("insert coin first");
    }
}
