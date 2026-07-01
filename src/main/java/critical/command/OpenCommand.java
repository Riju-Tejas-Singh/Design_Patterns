package critical.command;

public class OpenCommand implements Command {
    private final Document document;
    private final String fileName;

    public OpenCommand(Document document, String fileName) {
        this.document = document;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        document.open(fileName);
    }

    @Override
    public void undo() {
        System.out.println("Undoing open: " + fileName);
    }
}
