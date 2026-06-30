package critical.strategy.example2;

/**
 * This is Context class
 * Open - closed principal
 * Add functionality without changing project structure
 */
public class PaymentService {
    private final PaymentStrategy paymentStrategy;
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void makePayment (int amount) {
        paymentStrategy.pay(amount);
    }
}
