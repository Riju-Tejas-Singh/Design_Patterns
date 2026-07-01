package critical.observer.example2;

import java.util.Objects;

public class Editor {
    public EventManager events = new EventManager("open", "save");
    String file = "";

    void openFile(String filename) {
        this.file = filename;
        events.notifyListeners("open", file);
    }

    void saveFile() {
        if (!Objects.equals(file, "")) {
            events.notifyListeners("save", file);
        }
    }
}
