package high.state;

public class DispenseState implements State {
    @Override
    public void insertCoin(VendingMachineContext machine) {
        System.out.println("please wait for object to be dispensed");
    }

    @Override
    public void selectProduct(VendingMachineContext machine) {
        System.out.println("product already selected");
    }

    @Override
    public void dispenseProduct(VendingMachineContext machine) {
        System.out.println("dispensing product");
        machine.setNextState(new IdleState());
    }
}
