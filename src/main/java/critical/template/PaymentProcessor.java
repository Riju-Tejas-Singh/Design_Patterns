package critical.template;

abstract class PaymentProcessor {

    /**
     * Template Method, hence the name of this pattern
     */
    public final void processPayment() {
        validate();
        makePayment();
        sendReceipt();
    }

    private void validate() {
        System.out.println("Validating");
    }

    private void sendReceipt() {
        System.out.println("Sending receipt");
    }

    protected abstract void makePayment();
}
