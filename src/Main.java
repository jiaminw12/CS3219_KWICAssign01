
import java.util.ArrayList;
import java.util.Scanner;
import jiamin.PipeAndFilter;

public class Main {

    private static void launchCLI() {

        String wordsToIgnore = "", movieTitle = "";
        ArrayList<String> ignoreWordsArray = new ArrayList<>();
        ArrayList<String> movieArray = new ArrayList<>();

        System.out.println("----- Welcom to KWIC System -----");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Insert the following lines by separating with \",\" -----");
        System.out.println();

        System.out.println("----- Insert \"words to ignore\" -----");
        
        while(true){
           wordsToIgnore = sc.nextLine();
           if (wordsToIgnore.equals("")){
               break;
           } else {
               ignoreWordsArray.add(wordsToIgnore);
           }
        }

        System.out.println("----- Insert movie titles -----");
        
        while(true){
           movieTitle = sc.nextLine();
           if (movieTitle.equals("")){
               break;
           } else {
               movieArray.add(movieTitle);
           }
        }
        
        System.out.println("----- Please choose 1 of the following architectures -----");
        System.out.println("1. Implicit Invocation");
        System.out.println("2. Pipe and Filter");
        System.out.println("3. Exit");


        while (true) {
            String option = sc.next();

            switch (option) {
                case "1":
                    // implicit invocation
                    break;
                case "2":
                    // pipe and filter
                    PipeAndFilter pipeAndFilter = new PipeAndFilter();
                    pipeAndFilter.startArc(ignoreWordsArray, movieArray);
                    break;
                case "3":
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        launchCLI();
    }

}
