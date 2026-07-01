package high.state;

public class ClientTest {
    public static void main(String[] args) {
        VendingMachineContext machine = new VendingMachineContext();
        machine.selectProduct();
        machine.insertCoin();
        machine.selectProduct();
        machine.selectProduct();
        machine.dispenseProduct();
        machine.dispenseProduct();
    }
    //    insert coin first
    //    inserting coin
    //    selecting product
    //    product already selected
    //    dispensing product
    //    insert coin first
}
