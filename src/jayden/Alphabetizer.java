package jayden;
import java.util.ArrayList;
import java.util.Collections;


public class Alphabetizer  {
	
	ArrayList<ArrayList<String>> ShiftMovieTitle;
	ArrayList<String> CombineTitle;
	
	
	public void Sort(){
		
		Combine();
		Collections.sort(CombineTitle);
	}
	
	public void ReceiveShiftMovieTitle(ArrayList<ArrayList<String>> ShiftMovieTitle){
		this.ShiftMovieTitle = ShiftMovieTitle;
	}
	
	public ArrayList<String> GetCombineTitle(){
		return CombineTitle;
	}
	
	private void Combine(){
		
		ArrayList<String> CombineTitle = new ArrayList<String>();
		for(int i =0;i<ShiftMovieTitle.size();i++){
			ArrayList<String> Title = ShiftMovieTitle.get(i);
			String temp = "";
			for(int j=0;j<Title.size();j++){
				temp = temp+" "+Title.get(j);
			}
			CombineTitle.add(temp);
		}
		this.CombineTitle = CombineTitle;
	}
}
