package critical.command;

/**
 * Command Receiver Class : receives commands via the command invoker (remote)
 */
public class Document {
    private String content = "";

    public void open(String fileName) {
        System.out.println("Opening document: " + fileName);
        content = "Content of " + fileName;
    }

    public void save(String fileName) {
        System.out.println("Saving document: " + fileName);
        System.out.println("Content: " + content);
    }

    public void cut() {
        System.out.println("Cutting content");
        content = "";
    }

    public void paste(String text) {
        System.out.println("Pasting: " + text);
        content += text;
    }

    public String getContent() {
        return content;
    }
}
