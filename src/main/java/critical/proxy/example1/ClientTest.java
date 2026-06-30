package critical.proxy.example1;

public class ClientTest {
    public static void main(String[] args) {

        Database user =
                new DatabaseProxy("USER");
        user.deleteDatabase(); // Access Denied!
        Database admin =
                new DatabaseProxy("ADMIN");
        admin.deleteDatabase(); // Database deleted
    }
}
