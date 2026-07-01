package high.chainofresponsibility;

public class ClientTest {
    public static void main(String[] args) {
        SupportHandler level1 = new LevelOneSupportHandler();
        SupportHandler level2 = new LevelTwoSupportHandler();
        SupportHandler level3 = new LevelThreeSupportHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Request req1 = new Request("LEVEL1", "Simple issue");
        Request req2 = new Request("LEVEL2", "Complex issue");
        Request req3 = new Request("LEVEL3", "Critical issue");
        Request req4 = new Request("LEVEL4", "Unknown issue");

        level1.handleRequest(req1);
        level1.handleRequest(req2);
        level1.handleRequest(req3);
        level1.handleRequest(req4);
    }

    //    Level 1 Support handling: Simple issue
    //    Level 2 Support handling: Complex issue
    //    Level 3 Support handling: Critical issue
    //    Request not handled: LEVEL4
}
