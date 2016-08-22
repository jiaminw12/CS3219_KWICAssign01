package jiamin;

import java.util.ArrayList;

public abstract class Filter implements Runnable {

    protected static Pipe in = new Pipe();
    protected static Pipe out = new Pipe();
    
    public void setIn(Pipe p) {
        in = p;
    }

    public void setOut(Pipe p) {
        in = p;
    }

    // Write to it's pipe
    public void write(String s, ArrayList<String> arr) {
        if (s == null) {
            in.close();
            return;
        }
        in.write(s, arr);
    }

    // Read from it's pipe
    public ArrayList<String> read(String keyword) {
        return in.read(keyword);
    }

    // Write to it's pipe
    public void write(ArrayList<String> arr) {
        if (arr.isEmpty()) {
            in.close();
            return;
        }
        in.write(arr);
    }

    // Read from it's pipe
    public ArrayList<String> read() {
        return in.read();
    }

}
