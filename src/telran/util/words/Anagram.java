package telran.util.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		if(anagram == null || word == null || anagram.isEmpty() || word.isEmpty() || anagram.length() != word.length()) {
			return false;
		}
		Map<Character,Integer> wordLetters = getMapOfWordLetters(word);
		char anagramCharArray[] = anagram.toLowerCase().toCharArray();
		for(char letter : anagramCharArray) {
			int count=wordLetters.getOrDefault(letter, initialCounterValue);
			if(count==0) {
				return false;
			}
			wordLetters.put(letter, count-1);
			/*
			if(count > 0) {
				wordLetters.put(letter, count-1);
				continue;
			}
			return false;
			*/
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
	public static boolean isAnagram_1(String word, String anagram) {
		if(anagram == null || word == null || anagram.isEmpty() || word.isEmpty() || anagram.length() != word.length()) {
			return false;
		}
		String w1 = getSortedString(word);
		String a1 = getSortedString(anagram);
		return w1.compareTo(a1)==0;
	}
	private static String getSortedString(String str) {
		char chs[] = str.toLowerCase().toCharArray();
		List<Character> list = new ArrayList<>();
		for(char ch : chs) {
			list.add((Character)ch);
		}
		list.sort((ch1,ch2) -> ch1-ch2);
		char result[] = new char[list.size()];
		int i=0;
		for(Character ch : list) {
			result[i++] = ch;
		}
		return new String(result);
	}
}
