package com.learnjava.corejava;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckTest {

	@Test
	public void palindromeTest_NullInput()
	{
		String inputstr = null;
		boolean result;
		
		result = PalindromeCheck.isPalindrome(inputstr);
		
		assertTrue(!result);
	}
	
	@Test
	public void palindromeTest_ValidInputisPalindrome()
	{
		String inputstr = "noon";
		boolean result;
		
		result = PalindromeCheck.isPalindrome(inputstr);
		
		assertTrue(result);
		
	}
	
	
	@Test
	public void palindromeTest_ValidInputisNotAPalindrome()
	{
		String inputstr = "neon";
		boolean result;
		
		result = PalindromeCheck.isPalindrome(inputstr);
		
		assertTrue(!result);
	}
	
	
	@Test
	public void palindromeTest_ValidInputisAPalindrome1()
	{
		String inputstr = "radar";
		boolean result;
		
		result = PalindromeCheck.isPalindrome(inputstr);
		
		assertTrue(!result);
	}
	
	@Test
	public void palindromeTest_ValidInputisNotAPalindrome1()
	{
		String inputstr = "steroes";
		boolean result;
		
		result = PalindromeCheck.isPalindrome(inputstr);
		
		assertTrue(!result);
	}

}
