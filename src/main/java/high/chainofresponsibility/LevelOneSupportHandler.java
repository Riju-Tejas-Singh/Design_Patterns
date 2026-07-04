package high.chainofresponsibility;

public class LevelOneSupportHandler extends SupportHandler {

    public LevelOneSupportHandler (SupportHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    boolean canHandle(Request request) {
        return request.getType().equals("LEVEL1");
    }

    @Override
    void processRequest(Request request) {
        System.out.println("Level 1 Support handling: " + request.getMessage());
    }
}
