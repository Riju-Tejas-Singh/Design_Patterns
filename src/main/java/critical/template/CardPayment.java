package critical.template;

public class CardPayment extends PaymentProcessor {
    @Override
    protected void makePayment() {
        System.out.println("make card payment");
    }
}
