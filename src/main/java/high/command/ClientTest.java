package high.command;

public class ClientTest {
    public static void main(String[] args) {
        Document document = new Document();
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(new OpenCommand(document, "file.txt"));
        invoker.executeCommand(new PasteCommand(document, "Hello World"));
        invoker.executeCommand(new SaveCommand(document, "file.txt"));

        System.out.println("\n--- Undoing operations ---");
        invoker.undo();
        invoker.undo();

        System.out.println("\n--- Redoing operations ---");
        invoker.redo();
    }
    //    Opening document: file.txt
    //    Pasting: Hello World
    //    Saving document: file.txt
    //    Content: Content of file.txtHello World
    //
    //--- Undoing operations ---
    //    Undoing save: file.txt
    //    Undo paste
    //
    //--- Redoing operations ---
    //    Pasting: Hello World

}
