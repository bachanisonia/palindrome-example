package com.learnjava.corejava;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String inputstr)
	{
		boolean result = true;
		
		if (inputstr == null)
		{
			System.out.println("The input String is null");
			result = false;
			return result;
		}
		
		int strlen = inputstr.length()-1;
		
		for(int i=0; i < inputstr.length(); i++)
		{
			if (inputstr.charAt(i) != inputstr.charAt(strlen-i))
			{
				result = false;
				System.out.println("The given input string " + inputstr + " is NOT a palindrome.");
				return result;
			}
		}
		
		System.out.println("The given input string " + inputstr + " is a palindrome.");
		return result;
	}

}
