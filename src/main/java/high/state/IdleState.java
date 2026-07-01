package high.state;

public class IdleState implements State{
    @Override
    public void insertCoin(VendingMachineContext machine) {
        System.out.println("inserting coin");
        machine.setNextState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachineContext machine) {
        System.out.println("insert coin first");
    }

    @Override
    public void dispenseProduct(VendingMachineContext machine) {
        System.out.println("insert coin first");
    }
}
