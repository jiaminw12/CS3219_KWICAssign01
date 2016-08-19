
import java.util.Scanner;


public class Main {

    private static void launchCLI(){
        
        String wordsToIgnore = "";
        String movieTitle = "";
        
        System.out.println("----- Welcom to KWIC System -----");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Insert the following lines by separating with \",\" -----");
        System.out.println();
        
        System.out.println("----- Insert \"words to ignore\" -----");
        wordsToIgnore = sc.nextLine();
        
        System.out.println();
        
        System.out.println("----- Insert movie titles -----");
        movieTitle = sc.nextLine();
        
        System.out.println();
        System.out.println("----- Please choose 1 of the following architectures -----");
        System.out.println("1. Implicit Invocation");
        System.out.println("2. Pipe and Filter");
        System.out.println("Press other keys to exit.");
        
        while(true){
            String option = sc.next();
            
            switch(option){
                case "1":
                    // implicit invocation
                case "2":
                    // pipe and filter
                    
                default:
                    System.out.println("----- Program terminated. Thank You for using. -----");
                    System.exit(0);
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        launchCLI();
    }
    
}
