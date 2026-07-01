package high.state;

/**
 * State interface representing different states of the context class
 * IDLE --insert coin --> HAS_MONEY --select product --> DISPENSE -- dispense product --> IDLE
 */
public interface State {

    /**
     * IDLE to HAS_MONEY
     */
    void insertCoin(VendingMachineContext machine);

    /**
     * HAS_MONEY to DISPENSE
     */
    void selectProduct(VendingMachineContext machine);

    /**
     * DISPENSE to IDLE
     */
    void dispenseProduct(VendingMachineContext machine);
}
