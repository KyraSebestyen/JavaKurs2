package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary = new HashMap<>();
    private String file;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
        } catch (IOException ioException) {
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (dictionary.containsKey(words)) {
            return;
        }
        dictionary.put(words, translation);

    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {
        dictionary.remove(word);
        String translationForSearchedWord = null;
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                translationForSearchedWord = entry.getKey();
            }
        }
        dictionary.remove(translationForSearchedWord);
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            writer.close();
            return true;
        } catch (Exception ex){
            return false;
        }
    }
}

