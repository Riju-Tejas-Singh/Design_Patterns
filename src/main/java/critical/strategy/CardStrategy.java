package critical.strategy;

public class CardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("pay " + amount + " using card");
    }
}
