import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> wordAndTranslations;

    public DictionaryOfManyTranslations() {
        wordAndTranslations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (wordAndTranslations.containsKey(word)) {
            ArrayList<String> translations = wordAndTranslations.get(word);
            translations.add(translation);
            wordAndTranslations.put(word, translations);
        } else {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(translation);
            wordAndTranslations.put(word, translations);
        }
    }

    public ArrayList<String> translate(String word) {
        return wordAndTranslations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        wordAndTranslations.remove(word);
    }
}
