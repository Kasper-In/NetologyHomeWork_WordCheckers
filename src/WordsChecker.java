import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class WordsChecker {
    private String text;

    public WordsChecker(String text){
        this.text = text;
    }

    public boolean hasWord(String wordCheck){
        String[] splitWords = text.split("\\P{IsAlphabetic}+");
        Set<String> words = Arrays.stream(splitWords).collect(Collectors.toSet()); //Преобразуем массив в сет
        //System.out.println(setWords);
        return words.contains(wordCheck);
    }
}
