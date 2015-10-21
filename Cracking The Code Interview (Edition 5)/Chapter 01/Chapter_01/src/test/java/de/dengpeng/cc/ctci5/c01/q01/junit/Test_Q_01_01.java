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

package de.dengpeng.cc.ctci5.c01.q01.junit;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.dengpeng.cc.ctci5.c01.q01.Q_01_01_StringChecker;

public class Test_Q_01_01 {
	
	Q_01_01_StringChecker checker;

	@Before
	public void setUp() throws Exception {
		checker = new Q_01_01_StringChecker();
	}

	@Test
	public void test_01() {
		assertEquals(true, checker.hasAllUniqueCharacters("abcde"));
	}
	
	@Test
	public void test_02() {
		assertEquals(false, checker.hasAllUniqueCharacters("hello"));
	}
	
	@Test
	public void test_03() {
		assertEquals(false, checker.hasAllUniqueCharacters("apple"));
	}
	
	@Test
	public void test_04() {
		assertEquals(true, checker.hasAllUniqueCharacters("kite"));
	}
	
	@Test
	public void test_05() {
		assertEquals(true, checker.hasAllUniqueCharacters("padle"));
	}
}
