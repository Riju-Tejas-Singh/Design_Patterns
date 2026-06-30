package critical.adapter.example1;

public class ClientTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new RazorpayAdapter(new RazorpayGateway());
        paymentProcessor.pay(1000);
    }
    // output
    // Payment of 1000 using razorpay
}
