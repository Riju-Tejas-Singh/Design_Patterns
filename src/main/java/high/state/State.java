package high.state;

/**
 * State interface representing different states of the context class
 */
public interface State {
    void insertCoin(VendingMachine machine);
    void selectProduct(VendingMachine machine);
    void dispenseProduct(VendingMachine machine);
}
