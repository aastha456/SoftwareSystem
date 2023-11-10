import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String userInput = scan.nextLine();
		
		WordProcessor wordProcessor =  new WordProcessor();
		wordProcessor.setText(userInput);
		
		int wordCount = wordProcessor.countWords(userInput);
        int letterCount = wordProcessor.countLetters(userInput);
        int sentenceLength = wordProcessor.getLength(userInput);

        System.out.println("Word count: " + wordCount);
        System.out.println("Letter count: " + letterCount);
        System.out.println("Sentence length: " + sentenceLength);
        
        
        int wordCountNull = wordProcessor.countWords(null);
        int letterCountNull = wordProcessor.countLetters(null);
        int sentenceLengthNull = wordProcessor.getLength(null);

        System.out.println("Word count with null input: " + wordCountNull);
        System.out.println("Letter count with null input: " + letterCountNull);
        System.out.println("Sentence length with null input: " + sentenceLengthNull);

		
		
	

	}

}
