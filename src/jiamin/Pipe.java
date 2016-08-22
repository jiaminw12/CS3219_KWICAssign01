package jiamin;

import java.util.ArrayList;
import java.util.HashMap;

public class Pipe {

    static Pipe p;
    private boolean closed = false;
    private static HashMap<String, ArrayList<String>> output;
    private static ArrayList<String> finalOutput;

    public static Pipe getInstance() {
        if (p == null){
            p = new Pipe();
            output = new HashMap();
            finalOutput = new ArrayList<>();
        }
        return p;
    }

    // Write to arrayList
    public void write(String keyword, ArrayList<String> value) {
        if(output.get(keyword) == null){
            output.put(keyword, new ArrayList<String>());
        }
        
        if (keyword.equalsIgnoreCase("ignored")) {
            output.put("ignored", value);
        } else if (keyword.equalsIgnoreCase("movies")) {
            output.put("movies", value);
        }
    }

    // Read from the pipe
    public ArrayList<String> read(String keyword) {
        while (true) {
            if (output.isEmpty()) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println("InterruptedExcpetion caught in Pipe");
                }
            } else if (keyword.equalsIgnoreCase("ignored")) {
                return output.get("ignored");
            } else if (keyword.equalsIgnoreCase("movies")) {
                return output.get("movies");
            }
        }
    }
    
    public void write(ArrayList<String> value){
        finalOutput = value;
    }
    
    public ArrayList<String> read(){
        return finalOutput;
    }

    /**
     * Once closed it can never be reopened
     */
    public void close() {
        closed = true;
    }

}
