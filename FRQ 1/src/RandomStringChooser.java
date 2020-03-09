import java.util.ArrayList;
import java.util.List;

public class RandomStringChooser {
    private List<String> words;
    
    /**
     * Initializes a RandomStringChooser object with a wordArray.
     * @param wordArray the array of Strings to use
     */
    public RandomStringChooser(String[] wordArray) {
        words = new ArrayList<String>();
        for (String s : wordArray) words.add(s);
    }
    
    public String getNext() {
        int avail = words.size();
        if (avail == 0) return "NONE";
        int index = (int) (Math.random() * avail);
        String s = words.remove(index);
        return s;
    }
}