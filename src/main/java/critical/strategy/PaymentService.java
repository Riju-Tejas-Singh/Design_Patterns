package critical.strategy;

public class PaymentService {
    private final PaymentStrategy paymentStrategy;
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void makePayment (int amount) {
        paymentStrategy.pay(amount);
    }
}
