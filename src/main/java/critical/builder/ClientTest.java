package critical.builder;

public class ClientTest {

    public static void main(String[] args) {

        User user = new User.Builder("Riju", "riju@gmail.com")
                .age(24)
                .profession("Software Engineer")
                .salary(1500000)
                .build();

        user.display();
    }
}
