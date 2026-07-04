package high.state;

/**
 * State interface extended by different states of the context class
 * The methods of the State interface represent the events (or triggers) that the context can receive.
 * Their implementations perform actions and may cause transitions to other states.
 * <p>
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
