import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
public class NotePad {
    private Map<String, String> notes;
    private Map<String, LocalDate> creationDates;

    public NotePad() {
        notes = new HashMap<>();
        creationDates = new HashMap<>();
    }

    public String addNote(String title, String content) {
        if (notes.containsKey(title)) {
            return "duplicate-title";
        } else {
            notes.put(title, content);
            creationDates.put(title, LocalDate.now());
            return "note-added";
        }
    }
}
