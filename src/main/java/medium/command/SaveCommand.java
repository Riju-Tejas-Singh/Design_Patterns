package medium.command;

public class SaveCommand implements Command {
    private Document document;
    private String fileName;

    public SaveCommand(Document document, String fileName) {
        this.document = document;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        document.save(fileName);
    }

    @Override
    public void undo() {
        System.out.println("Undoing save: " + fileName);
    }
}
