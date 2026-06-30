package critical.proxy.example1;

public class DatabaseService implements Database {
    @Override
    public void deleteDatabase() {
        System.out.println("Database deleted");
    }
}
