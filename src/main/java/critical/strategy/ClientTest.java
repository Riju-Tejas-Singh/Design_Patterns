package critical.strategy;

public class ClientTest {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new UpiStrategy());
        paymentService.makePayment(100);
    }
}
