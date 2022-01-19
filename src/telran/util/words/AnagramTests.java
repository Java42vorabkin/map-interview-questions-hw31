package telran.util.words;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.words.Anagram.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTests {
String word = "Hello";
	

	@Test
	void testMTrue() {
		assertTrue(isAnagram(word, "hello"));
		assertTrue(isAnagram(word, "olleh"));
		assertTrue(isAnagram(word, "helol"));
		assertTrue(isAnagram(word, "lelho"));
		assertTrue(isAnagram(word, "ellho"));
	}
	@Test
	void testMFalse() {
		assertFalse(isAnagram(word, "helll"));
		assertFalse(isAnagram(word, "hell"));
		assertFalse(isAnagram(word, "heloo"));
		assertFalse(isAnagram(word, "hella"));
		assertFalse(isAnagram(word, "oleho"));
	}

	@Test
	void testSTrue() {
		assertTrue(isAnagram_1(word, "hello"));
		assertTrue(isAnagram_1(word, "olleh"));
		assertTrue(isAnagram_1(word, "helol"));
		assertTrue(isAnagram_1(word, "lelho"));
		assertTrue(isAnagram_1(word, "ellho"));
	
	}
	@Test
	void testSFalse() {
		assertFalse(isAnagram_1(word, "helll"));
		assertFalse(isAnagram_1(word, "hell"));
		assertFalse(isAnagram_1(word, "heloo"));
		assertFalse(isAnagram_1(word, "hella"));
		assertFalse(isAnagram_1(word, "oleho"));
		
	}

}
