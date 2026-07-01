package critical.chainofresponsibility;

public class LevelThreeSupportHandler extends SupportHandler {
    @Override
    boolean canHandle(Request request) {
        return request.getType().equals("LEVEL3");
    }

    @Override
    void processRequest(Request request) {
        System.out.println("Level 3 Support handling: " + request.getMessage());
    }
}
