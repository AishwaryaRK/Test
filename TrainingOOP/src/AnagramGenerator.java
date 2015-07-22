
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGenerator {

	public static Collection<String> getAnagrams(List<String> words) {
		Map<String, String> anagrams = new HashMap<String, String>();
		for (String word : words) {
			String sortedWord = getSortedWord(word);
			if (anagrams.containsKey(sortedWord)) {
				word += " " + anagrams.get(sortedWord);
				anagrams.remove(sortedWord);
				anagrams.put(sortedWord, word);
			} else {
				anagrams.put(sortedWord, word);
			}

		}
		return anagrams.values();
	}

	private static String getSortedWord(String word) {
		char[] sortedWord = word.toCharArray();
		Arrays.sort(sortedWord);
		String sorted = new String(sortedWord);
		return sorted;
	}

}
