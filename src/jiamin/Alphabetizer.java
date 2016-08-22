package jiamin;

import java.util.Collections;

public class Alphabetizer extends Filter {

    @Override
    public void run() {
        Collections.sort(read());
    }

}
