import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static NotePad notePad = new NotePad();
    private static Scanner scanner = new Scanner(System.in);


    private static String addNoteMenu() {
        System.out.println("to back to menu enter 5 else enter the title");
        String title = scanner.nextLine();
        if(title.equals("5"))
            return "5";
        System.out.println("enter the text");
        String content = scanner.nextLine();
        return (notePad.addNote(title, content));
    }

    private static String removeNoteMenu() {
        System.out.println("to back to menu enter 5 else enter the title");
        String title = scanner.nextLine();
        if(title.equals("5"))
            return "5";
        return (notePad.removeNote(title));
    }

    private static String exportNoteMenu() throws IOException {
        System.out.println("to back to menu enter 5 else enter the title");
        String title = scanner.nextLine();
        if(title.equals("5"))
            return "5";
        notePad.exportNote(title);
        return "";
    }
}