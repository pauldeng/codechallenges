/**
 * 
 * Cracking the Code Interview (Edition 5)
 * Question 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * 
 * Assumptions:
 * 1. ASCII string, not UNICODE string
 * 2. all characters including extended and unused codes
 * 
 */

package de.dengpeng.cc.ctci5.c01.q01;

/**
 * The Class of Question 01.01.
 */
public class Q_01_01_StringChecker {
	
	/** The Constant of ASCII characters size. */
	private static final int ASCII_SIZE = 256;
	
	/** The Constant of unicode characters size. */
	private static final int UTF8_SIZE = 1111998;
	
	/**
	 * Checks if the string has all unique characters.
	 *
	 * @param text the string need to be checked
	 * @return true, if the input text contains only unique characters
	 */
	public boolean hasAllUniqueCharacters(String text){
		
		/**
		 * if the size of string is greater than the ascii table size, 
		 * it must have duplications and should return false
		 */
		if(text.length() > ASCII_SIZE){
			return false;
		}
		
		/**
		 * create a bool array with the same size of ascii table.
		 * log the char to true in the position of char index in ascii table.
		 * if the table value is already true, it is a duplication and should return false.
		 */
		boolean[] charMap = new boolean[ASCII_SIZE];
		for(int i=0; i<text.length();i++){
			int c = text.charAt(i);
			if (charMap[c] == true){
				return false;
			}else{
				charMap[c] = true;
			}
		}
		return true;
	}

}
