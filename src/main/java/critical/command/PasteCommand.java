package critical.command;

public class PasteCommand implements Command {
    private Document document;
    private String text;

    public PasteCommand(Document document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.paste(text);
    }

    @Override
    public void undo() {
        System.out.println("Undo paste");
    }
}
