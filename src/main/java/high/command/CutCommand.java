package high.command;

public class CutCommand implements Command {
    private final Document document;
    private String backup;

    public CutCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        backup = document.getContent();
        document.cut();
    }

    @Override
    public void undo() {
        document.paste(backup);
        System.out.println("Undo cut - restored content");
    }
}
