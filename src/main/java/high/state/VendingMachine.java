package high.state;

/**
 * Context Class Vending Machine
 */
public class VendingMachine {
    private State state;
    public VendingMachine() {
        this.state = new IdleState();
    }
    public void setNextState(State state) {
        this.state = state;
    }
    public void insertCoin() {
        state.insertCoin(this);
    }
    public void selectProduct() {
        state.selectProduct(this);
    }
    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}
