/**
 * 
 * A word processor class that implements the counter interface
 *
 */
public class WordProcessor implements Counter {
	private String text;
	/**
	 * Gets the current fall-back text stored in the WordProcessor.
	 * 
	 * @return The current fall-back text.
	 */
	public String getText() {
        return text;
    }
	/**
	 * Sets the fall-back text in the WordProcessor.
	 * 
	 * @param text The fall-back text to set.
	 */

    public void setText(String text) {
        this.text = text;
    }
    
    /**
     * Counts the number of words in the given sentence.
     *
     * @param sentence The input sentence.
     * @return The number of words in the sentence.
     */
	@Override
	public int countWords(String sentence) {
		String[] words = sentence.split(" ");

		return words.length;
	}
	 /**
     * Counts the number of letters in the given sentence.
     *
     * @param sentence The input sentence.
     * @return The number of letters in the sentence.
     */

	@Override
	public int countLetters(String sentence) {
		int letters = 0;
		for(int i = 0; i < sentence.length(); i++) {
			if ( Character.isLetter(sentence.charAt(i)) )
				letters++;
		}
	return 0;
	}
	 /**
     * Gets the length of the given sentence.
     *
     * @param sentence The input sentence.
     * @return The length of the sentence.
     */

	@Override
	public int getLength(String sentence) {
	
		return sentence.length();
	}
	

}
