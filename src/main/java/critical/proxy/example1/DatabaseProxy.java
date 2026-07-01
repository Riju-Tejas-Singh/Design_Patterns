package critical.proxy.example1;

/**
 * Only admin can delete
 */
public class DatabaseProxy implements Database {
    private final DatabaseService databaseService;
    private final String role;

    public DatabaseProxy(String role) {

        this.role = role;
        this.databaseService = new DatabaseService();
    }

    @Override
    public void deleteDatabase() {

        if(role.equalsIgnoreCase("ADMIN")) {

            databaseService.deleteDatabase();

        } else {

            System.out.println("Access Denied!");
        }
    }
}
