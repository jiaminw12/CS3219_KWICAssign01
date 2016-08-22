package jiamin;

public class PipeAndFilter {

    public void startArc(String wordsToIgnore, String inputLines) {
        
        
        Pipe p1 = Pipe.getInstance();
        new Input(wordsToIgnore, inputLines).run();
        new Input().setOut(p1);
        new CircularShift().setIn(p1);
        
        new CircularShift().run();
        new CircularShift().setOut(p1);
        
        new Alphabetizer().setIn(p1);
        new Alphabetizer().run();
        new Alphabetizer().setOut(p1);
        
        new Output().setIn(p1);
        new Output().run();
    }

}
