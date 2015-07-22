import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnagramGenClient {

	public static void main(String[] args) throws IOException {
		String inputFile = "C:\\input1.txt";
		List<String> words = populateWordsList(inputFile);
		Collection<String> anagramsList = AnagramGenerator.getAnagrams(words);

		for (String string : anagramsList) {
			System.out.println(string);
		}

	}

	private static List<String> populateWordsList(String inputFile) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
		List<String> words = new ArrayList<String>();
		String word = bufferedReader.readLine();
		while (word != null) {
			words.add(word);
			word = bufferedReader.readLine();
		}
		return words;
	}

}
