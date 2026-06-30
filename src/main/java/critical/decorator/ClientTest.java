package critical.decorator;

public class ClientTest {
    public static void main(String[] args) {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        // output
        // Simple Coffee with milk and Sugar
        // 130.0
    }
}
