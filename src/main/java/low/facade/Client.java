package low.facade;

public class Client {
  public static void main(String[] args) {
    facade.NetworkAccessFacade access = new NetworkAccessFacade();
    access.communicate();
  }
}
