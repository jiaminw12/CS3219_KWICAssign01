
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> allLines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String nextLine = sc.nextLine();
            if(nextLine.equals("")){
                break;
            }
            allLines.add(nextLine);
        }
        
        printAllLines(analyseLine(allLines));
    }
    
    private static void printAllLines(ArrayList<String> newLines){
        Collections.sort(newLines);
        for (int i = 0; i<newLines.size(); i++){
            System.out.println(newLines.get(i));
        }
    }
    
    
    private static ArrayList<String> analyseLine(ArrayList<String> allLines){
        
        // final result
        ArrayList<String> newLines = new ArrayList<>();
        
        for (int i = 0; i < allLines.size(); i++){
            // Read lines by lines
            String startLine = allLines.get(i);
            
            String[] splitLine = startLine.split(" ");
            
            for (int j=0; j < splitLine.length; j++){
                if(matchWord(splitLine[0])){
                    // add and reverse
                    splitLine = reverseString(allLines.get(i), splitLine[j]).split(" ");
                } else {
                    newLines.add(joinAllWords(splitLine));
                    splitLine = reverseString(allLines.get(i), splitLine[j]).split(" ");
                }
            }
        }
        return newLines;
    }
    
    private static String reverseString(String line, String delimenter){
        String finalWord = "";
        
        line = line.trim();
        String arr[] = line.split(delimenter, 2);

        String firstWord = arr[0].trim();
        String theRest = arr[1].trim();
        
        if(firstWord.equals("")){
            finalWord = theRest + " " + delimenter;
        } else if (theRest.equals("")){
            finalWord = delimenter + " " +  firstWord;
        } else {
            finalWord = theRest + " " +  firstWord + " " + delimenter;
        }
        
        
        return finalWord;
    }
    
   private static boolean matchWord(String word){
       word = word.trim();
   
       // special words
        if (word.equals("is")){
            return true;
        } 

        if(word.equals("the")){
            return true;
        }

        if(word.equals("of")){
            return true;
        }

        if(word.equals("and")){
            return true;
        }

        if(word.equals("as")){
            return true;
        }

        if(word.equals("a")){
            return true;
        }

        if(word.equals("after")){
            return true;
        } else {
            return false;
        }
            
   }
   
   private static String joinAllWords(String[] splitLine){
        String temp = "";
        for (int z=0;z<splitLine.length;z++){
            temp += splitLine[z] + " ";
        }
        return temp;
   }
   
}
