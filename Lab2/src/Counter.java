/**
 * Counter Interface. The Counter interface provides methods for counting and
 * analyzing text.
 * 
 * 
 */
public interface Counter {
	/**
	 * This method counts the number of words in a given sentence.
	 * 
	 * @param sentence The input sentence.
	 * @return returns the number of words in the sentence.
	 */
	int countWords (String sentence);
	/**
	 * This method counts the number of letters in a given sentence.
	 * 
	 * @param sentence The input sentence.
	 * @return The number of letters in the sentence.
	 */
	int countLetters (String sentence);
	/**
	 * Gets the length of the sentence including spaces.
	 *
	 * @param sentence The input sentence.
	 * @return The length of the sentence including spaces.
	 */
	int getLength (String sentence);

}
