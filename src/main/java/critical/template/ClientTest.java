package critical.template;

public class ClientTest {
    public static void main(String[] args) {
        PaymentProcessor card = new CardPayment();
        PaymentProcessor upi = new UpiPayment();

        card.processPayment();

        System.out.println("----------------");

        upi.processPayment();
    }
}
