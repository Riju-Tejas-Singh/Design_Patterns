package critical.adapter.example1;

// Third-party library

/**
 * Adaptee or 3rd party class, you cannot change it
 */
public class RazorpayGateway {

    public void makePayment(int amount) {
        System.out.println("Payment of " + amount + " using razorpay");
    }
}
