package jayden;

import java.util.ArrayList;

public class CircularShift {

    private ArrayList<ArrayList<String>> MovieTitles;
    private ArrayList<ArrayList<String>> ShiftedMovieTitles;
    private ArrayList<String> WordsToIgnore;

    public void Shift() {
        ShiftedMovieTitles = new ArrayList<ArrayList<String>>();
        int NumberOfMovie = MovieTitles.size();
        for (int i = 0; i < NumberOfMovie; i++) {
            ArrayList<String> Movie = MovieTitles.get(i);
            int NumberOfWordsInMovie = Movie.size();
            for (int j = 0; j < NumberOfWordsInMovie; j++) {
                ArrayList<String> temp = new ArrayList<String>();
                for (int k = 0; k < NumberOfWordsInMovie; k++) {
                    String tempString = Movie.get((j + k) % NumberOfWordsInMovie);
                    if (k == 0 && (WordsToIgnore.contains(tempString.toLowerCase()))) {
                        break;
                    } else {
                        temp.add(tempString);
                    }
                }
                if (!temp.isEmpty()){
                    ShiftedMovieTitles.add(temp);
                }
            }
        }
    }

    public void ReceiveWordsToIgnore(ArrayList<String> WordsToIgnore) {
        this.WordsToIgnore = WordsToIgnore;
    }

    public void ReceiveTitle(ArrayList<ArrayList<String>> MovieTitles) {
        this.MovieTitles = MovieTitles;
    }

    public ArrayList<ArrayList<String>> GetShiftMovieTitles() {
        return this.ShiftedMovieTitles;
    }

}
