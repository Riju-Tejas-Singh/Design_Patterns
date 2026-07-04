package high.chainofresponsibility;

public class LevelTwoSupportHandler extends SupportHandler {

    public LevelTwoSupportHandler (SupportHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    boolean canHandle(Request request) {
        return request.getType().equals("LEVEL2");
    }

    @Override
    void processRequest(Request request) {
        System.out.println("Level 2 Support handling: " + request.getMessage());
    }
}
