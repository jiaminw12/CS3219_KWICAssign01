package jiamin;

import java.util.ArrayList;
import java.util.Arrays;

public class Input extends Filter {

    private ArrayList<String> wordsToIgnore;
    private ArrayList<String> movieTitle;

    public Input() {
    }

    public Input(ArrayList<String> wordsToIgnore, ArrayList<String> movieTitle) {
        this.wordsToIgnore = wordsToIgnore;
        this.movieTitle = movieTitle;
    }

    @Override
    public void run() {
        if (wordsToIgnore == null || movieTitle == null) {
            return;
        } else {
            write("ignored", splitWord(wordsToIgnore));
            write("movies", splitWord(movieTitle));
        }
    }

    private static ArrayList<String> splitWord(ArrayList<String> stringToBeSplit) {
        ArrayList<String> tempArray = new ArrayList<>();
        for(int i=0; i<stringToBeSplit.size(); i++){
            String[] temp =  stringToBeSplit.get(i).split(",");
            tempArray.addAll(new ArrayList<>(Arrays.asList(temp)));
        }
        
        return tempArray;
    }

}
