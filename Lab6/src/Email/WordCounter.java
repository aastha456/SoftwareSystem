package Email;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * A wordcounter class which provides method for counting unique words within a sentence
 *
 */
public class WordCounter {
	/**
	* Maps words to their occurrence count.
	*/
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	/**
	 * Adds word to word map
	 * 
	 * @param word the word to be added
	 */
	public void addWord(String word) {
		wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
	}
	/**
	 * adds word to the sentence to the wordmap
	 * 
	 * @param sentence the input sentence containing word
	 */
	
	public void addSentence(String sentence) {
		String[] words = sentence.split("\\s+");
		for(String word : words) {
			addWord(word.toLowerCase());
		}
	}
	/**
	 * Outputs the result by printing each word along with associated occurrence count 
	 */
	 public void outputResults() {
	        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
