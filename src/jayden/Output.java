package jayden;

import java.util.ArrayList;

public class Output {

    ArrayList<String> SortTitle;

    public void GetSortTitle(ArrayList<String> SortTitle) {
        this.SortTitle = SortTitle;
    }

    public void print() {
        for (int i = 0; i < SortTitle.size(); i++) {
            System.out.println(SortTitle.get(i).replaceAll("^\\s+", ""));
        }
    }

}
