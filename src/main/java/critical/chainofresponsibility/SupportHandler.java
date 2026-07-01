package critical.chainofresponsibility;

/**
 * Parent handler abstract class
 * Another example : <a href="https://gitlab.com/shrayansh8/interviewcodingpractise/-/tree/main/src/main/java/com/conceptandcoding/LowLevelDesign/DesignPatterns/LLDChainResponsibilityDesignPattern?ref_type=heads">...</a>
 */
public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Request not handled: " + request.getType());
        }
    }

    abstract boolean canHandle(Request request);
    abstract void processRequest(Request request);
}
