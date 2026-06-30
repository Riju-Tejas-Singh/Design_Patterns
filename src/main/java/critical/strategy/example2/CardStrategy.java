package critical.strategy.example2;

public class CardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("pay " + amount + " using card");
    }
}
