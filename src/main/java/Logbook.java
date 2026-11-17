import java.util.ArrayList;

public class Logbook {
    private ArrayList<String> entries;

    public Logbook() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public int getEntryCount() {
        return entries.size();
    }

    public void printAll() {
        for (String entry : entries) {
            System.out.println("  " + entry);
        }
    }
}
