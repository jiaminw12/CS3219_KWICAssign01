/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayden;

import java.util.ArrayList;
import java.util.Arrays;

public class Input {

    ArrayList<ArrayList<String>> MovieTitle = new ArrayList<ArrayList<String>>();
    ArrayList<String> WordsToIgnore = new ArrayList<String>();

    public void Parse(ArrayList<String> MovieTitle, ArrayList<String> WordsToIgnore) {

        this.MovieTitle = SplitMovieTitle(MovieTitle);
        this.WordsToIgnore = SplitIgnoreWord(WordsToIgnore);
    }

    public ArrayList<ArrayList<String>> GetMovieTitle() {
        return this.MovieTitle;
    }

    public ArrayList<String> GetIgnore() {
        return this.WordsToIgnore;
    }

    private ArrayList<ArrayList<String>> SplitMovieTitle(ArrayList<String> ToBeSplit) {
        ArrayList<ArrayList<String>> MovieTitle = new ArrayList<ArrayList<String>>();
        String[] SplitLine = ToBeSplit.get(0).split(",");
        for (int i = 0; i < SplitLine.length; i++) {
            String[] SplitWord = SplitLine[i].split("\\s");
            ArrayList<String> LineOfWord = new ArrayList<String>();
            for (int j = 0; j < SplitWord.length; j++) {
                if (SplitWord[j].trim().length() != 0) {
                    LineOfWord.add(SplitWord[j]);
                }
            }
            MovieTitle.add(LineOfWord);
        }
        return MovieTitle;
    }

    private ArrayList<String> SplitIgnoreWord(ArrayList<String> WordsToIgnore) {

        ArrayList<String> ToReturn = new ArrayList<String>();
        String[] Ignore = WordsToIgnore.get(0).split(",");

        for (int i = 0; i < Ignore.length; i++) {
            String word = Ignore[i].trim();
            if (word.trim().length() != 0) {
                ToReturn.add(Ignore[i].trim());
            }
        }

        return ToReturn;
    }
}
