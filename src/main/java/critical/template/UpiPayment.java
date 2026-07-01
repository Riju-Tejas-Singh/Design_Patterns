package critical.template;

public class UpiPayment extends PaymentProcessor{
    @Override
    protected void makePayment() {
        System.out.println("make upi payment");
    }
}
