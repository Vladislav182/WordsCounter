package Algoritmi;
import java.util.*;
import java.io.*;
 
public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws FileNotFoundException {
			 
			HashMap <String, Integer> wordCounter = new HashMap<String, Integer>();
	 
			Scanner wordsFile = new Scanner(new File("words.txt"));
	 
			Scanner sampleFile = new Scanner(new File("sample.txt"));
	 
			String words[];
	 
			int counter = 0;
	 
			while (wordsFile.hasNextLine()) {
	 
				String searchedWord = wordsFile.nextLine().toLowerCase();
	 
				wordCounter.put(searchedWord, 0);
			}
	 
			wordsFile.close();
	 
			int[] wordsCount = new int[words.length];
	 
			while (sampleFile.hasNext()) {
	 
				String sampleWord = sampleFile.next().toLowerCase();
	 
				for (String word : words) {
	 
					if (sampleWord.contains(word)) {
	 
						counter++;
	 
					}
	 
				}
	 
			}
	 
			sampleFile.close();
			PrintStream resultFile = new PrintStream("result.txt");
	 
			for (String word : words) {
	 
				resultFile.format("%s - %s%n", word,wordsCount[words.indexOf(word)]);
	            // тук ми дава грешка
	 
			}
	 
			resultFile.close();
	 
		}
	 
	}