package jiamin;

import java.util.ArrayList;

public class Output extends Filter {

    @Override
    public void run() {
        printAllLines(read());
    }

    private static void printAllLines(ArrayList<String> newLines) {
        for (int i = 0; i < newLines.size(); i++) {
            System.out.println(newLines.get(i));
        }
    }

}
