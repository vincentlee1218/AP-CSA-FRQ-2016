import java.util.ArrayList;
import java.util.List;

public class RandomLetterChooser extends RandomStringChooser {
	
	private String word;
	
	/** Constructs a random letter chooser using the given string str.
	 * Precondition: str contains only letters.
	 */
	public RandomLetterChooser(String str) {
		String[] res = new String[str.length()];
	}

	/** Returns an array of single-letter strings.
	 * Each of these strings consists of a single letter from str. Element k
	 * of the returned array contains the single letter at position k of str.
	* For example, getSingleLetters("cat") returns the
	* array { "c", "a", "t" }.
	*/
	public static String[] getSingleLetters(String str) {
		String[] res = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			res[0] = Character.toString(str.charAt(i));
		}
		return res;
	}
}