package review_session.week8;

import java.util.Arrays;

public class SentenceSplit {

	public static void main(String[] args) {
		
		
		String sentence= "Java is fun"; //delimeter
		
		
		//find out how many words in the sentence and print
		
		String[] words = sentence.split(" ");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		System.out.println("------------------------------");		
		
		String[] words2 = words[0].split("a");
		
		System.out.println(Arrays.toString(words2));
		System.out.println(words2.length);
		
		
		System.out.println("------------------------------");
		
		
		String[] words3 = sentence.split(" ", 2);
		System.out.println(Arrays.toString(words3));
		System.out.println(words3.length);
		
		System.out.println("------------------------------");
		
		//find out how words in the sentence and print		
				
		String results = "About 117,000,000 results (1.33 seconds)";
		String[] googleArr = results.split(" ");
		System.out.println(Arrays.toString(googleArr));
		
		for(String item : googleArr) {
			System.out.println(item);
		}
		
		System.out.println("------------------------------");
		
		String sentence1 = "play, run, write,  play, read, play, work, watch, play";
		String[] words4 = sentence1.split("play", 2); // change 1, 2, 3, 4
		System.out.println(Arrays.toString(words4));
		
 
	}

}
