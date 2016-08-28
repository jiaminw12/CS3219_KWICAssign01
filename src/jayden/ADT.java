package jayden;

import java.util.ArrayList;
//Master control for II



public class ADT {

	public void startArc(ArrayList<String> WordsToIgnore, ArrayList<String> InputLines ){
		
            Input input = new Input();
            CircularShift Cs = new CircularShift();
            input.Parse(InputLines,WordsToIgnore);
            Cs.ReceiveTitle(input.GetMovieTitle());
            Cs.ReceiveWordsToIgnore(input.GetIgnore());
            Cs.Shift();
            Alphabetizer Ar = new Alphabetizer();
            Ar.ReceiveShiftMovieTitle(Cs.GetShiftMovieTitles());
            Ar.Sort();
            Output output = new Output();
            output.GetSortTitle(Ar.GetCombineTitle());
            output.print();
		
	}
 		
 		
}
