
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import jiamin.PipeAndFilter;

public class Main {

    private static void launchCLI() throws IOException {

        String wordsToIgnorePath = "", movieTitlePath = "";
        ArrayList<String> ignoreWordsArray = new ArrayList<>();
        ArrayList<String> movieArray = new ArrayList<>();

        System.out.println("----- Welcom to KWIC System -----");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Insert \"words to ignore\" path -----");
        wordsToIgnorePath = sc.nextLine();
        ignoreWordsArray = readFile(wordsToIgnorePath);
        System.out.println();

        System.out.println("----- Insert movie titles path -----");
        movieTitlePath = sc.nextLine();
        movieArray = readFile(movieTitlePath);
        System.out.println();
        
        System.out.println("----- Please choose 1 of the following architectures -----");
        System.out.println("1. Implicit Invocation");
        System.out.println("2. Pipe and Filter");
        System.out.println("3. Exit\n");

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

    public static void main(String[] args) throws IOException {
        launchCLI();
    }

    private static ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> tempArray = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = null;
        while ((line = br.readLine()) != null) {
            tempArray.add(line);
        }
        return tempArray;
    }

}
