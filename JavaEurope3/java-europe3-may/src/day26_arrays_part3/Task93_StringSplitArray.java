package day26_arrays_part3;

import java.util.Arrays;

public class Task93_StringSplitArray {

	public static void main(String[] args) {
		
		String centence = "As he crossed toward the pharmacy at the corner he involuntarily turned his head"
				+ " because of a burst of light that had ricocheted from his temple,"
				+ " and saw, with that quick smile with which we greet a rainbow or a rose,"
				+ " a blindingly white parallelogram of sky being unloaded from the van a dresser"
				+ " with mirrors across which, as across a cinema screen,"
				+ " passed a flawlessly clear reflection of boughs sliding and swaying not arboreally,"
				+ " but with a human vacillation, produced by the nature of those who were carrying this sky,"
				+ " these boughs, this gliding façade.";
        String[] words = centence.split(" ");
        System.out.println(words.length);
        for(String val : words) {
        	System.out.println(val);
        }
        
        
        System.out.println(words[81]);
        
	}

}
