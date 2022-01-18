package telran.util.words;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
/**
 * 
 * @param word
 * @param anagram
 * @return true if anagram contains a word comprising of only all letters from a given word (case insensitive)
 * implementation requirements: O[N], using only one map and two passing's over (one is over word and other is over anagram)
 */
	static int initialCounterValue = 0;
	public static boolean isAnagram(String word, String anagram) {
	//TODO - Done
		if(anagram.isEmpty() || word.isEmpty() || anagram.length() != word.length()) {
			return false;
		}
		Map<Character,Integer> wordLetters = getMapOfWordLetters(word);
		char anagramCharArray[] = anagram.toLowerCase().toCharArray();
		for(char letter : anagramCharArray) {
			int count=wordLetters.getOrDefault(letter, initialCounterValue);
			if(count > 0) {
				wordLetters.put(letter, count-1);
				continue;
			} 
			return false;
		}
		return true;
	}

	private static Map<Character, Integer> getMapOfWordLetters(String word) {
		Map<Character,Integer> map = new HashMap<>();
		char wordCharArray[] = word.toLowerCase().toCharArray();
		for(char letter : wordCharArray) {
			map.put(letter, map.getOrDefault(letter, initialCounterValue) +1 );
		}
		return map;
	}
}
