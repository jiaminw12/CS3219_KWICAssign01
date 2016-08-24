package jiamin;

import java.util.ArrayList;

public class CircularShift extends Filter {

    @Override
    public void run() {
        write(analyseLine(read("ignored"), read("movies")));
    }

    private static ArrayList<String> analyseLine(ArrayList<String> wordsToIgnore, ArrayList<String> movieTitleArray) {

        // final result
        ArrayList<String> newLines = new ArrayList<>();

        for (int i = 0; i < movieTitleArray.size(); i++) {
            // Read lines by lines
            String startLine = movieTitleArray.get(i).trim();

            String[] splitLine = startLine.split(" ");

            for (int j = 0; j < splitLine.length; j++) {
                if (matchWord(wordsToIgnore, splitLine[0])) {
                    // add and reverse
                    splitLine = reverseString(movieTitleArray.get(i), splitLine[j]).split(" ");
                } else {
                    newLines.add(joinAllWords(splitLine));
                    splitLine = reverseString(movieTitleArray.get(i), splitLine[j]).split(" ");
                }
            }
        }
        return newLines;
    }

    private static String reverseString(String line, String delimenter) {
        String finalWord = "";

        line = line.trim();
        String arr[] = line.split(delimenter, 2);

        String firstWord = arr[0].trim();
        String theRest = arr[1].trim();

        if (firstWord.equals("")) {
            finalWord = theRest + " " + delimenter;
        } else if (theRest.equals("")) {
            finalWord = delimenter + " " + firstWord;
        } else {
            finalWord = theRest + " " + firstWord + " " + delimenter;
        }

        return finalWord;
    }

    private static boolean matchWord(ArrayList<String> wordsToIgnoreArray, String word) {
        word = word.trim();

        for (int i = 0; i < wordsToIgnoreArray.size(); i++) {
            if (word.equalsIgnoreCase(wordsToIgnoreArray.get(i).trim())) {
                return true;
            }
        }
        return false;
    }

    private static String joinAllWords(String[] splitLine) {
        String temp = "";
        for (int z = 0; z < splitLine.length; z++) {
            if (z == splitLine.length-1){
                temp += splitLine[z];
            } else {
                temp += splitLine[z] + " ";
            }
        }
        return temp;
    }

}
