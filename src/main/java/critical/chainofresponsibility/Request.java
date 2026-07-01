package critical.chainofresponsibility;

public class Request {
    private final String type;
    private final String message;

    public Request(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
