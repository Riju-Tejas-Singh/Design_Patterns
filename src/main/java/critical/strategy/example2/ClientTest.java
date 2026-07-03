package critical.strategy.example2;

public class ClientTest {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new UpiStrategy());
        paymentService.makePayment(100);
    }
    // pay 100 using upi
}
