package critical.template;

abstract class PaymentProcessor {

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
