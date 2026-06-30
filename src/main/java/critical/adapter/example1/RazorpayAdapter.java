package critical.adapter.example1;

/**
 * Adapter class implementing the target class
 */
public class RazorpayAdapter implements PaymentProcessor {
    private final RazorpayGateway gateway;
    public RazorpayAdapter(RazorpayGateway gateway) {
        this.gateway = gateway;
    }
    @Override
    public void pay(int amount) {
        gateway.makePayment(amount);
    }
}
