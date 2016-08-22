package jiamin;

import java.util.ArrayList;
import java.util.Arrays;

public class Input extends Filter {

    private String wordsToIgnore;
    private String movieTitle;

    public Input() {
    }

    public Input(String wordsToIgnore, String movieTitle) {
        this.wordsToIgnore = wordsToIgnore;
        this.movieTitle = movieTitle;
    }

    @Override
    public void run() {
        if (wordsToIgnore == null || movieTitle == null) {
            return;
        } else {
            write("ignored", new ArrayList<>(Arrays.asList(splitWord(wordsToIgnore))));
            write("movies", new ArrayList<>(Arrays.asList(splitWord(movieTitle))));
        }
    }

    private static String[] splitWord(String stringToBeSplit) {
        return stringToBeSplit.split(",");
    }

}
