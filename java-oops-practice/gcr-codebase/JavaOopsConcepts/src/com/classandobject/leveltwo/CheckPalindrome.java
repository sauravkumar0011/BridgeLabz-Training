package com.classandobject.leveltwo;

public class CheckPalindrome {

    String text;
	
    CheckPalindrome(String text) {
		this.text=text;
	}
    
    //Method to check palindrome
	public boolean isPalindrome() {
	String cleantext = text.replaceAll("\\s","").toLowerCase();
	String reverseText = new StringBuilder(cleantext).reverse().toString();

	return cleantext.equals(reverseText);
	}
	
	//Method to display result
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" is palindrome");
			}
		else {
			System.out.println(text+" is not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPalindrome checker1 = new CheckPalindrome("A man a plan a canal Panama");
		CheckPalindrome checker2 = new CheckPalindrome("Hello");
		
		checker1.diplayResult();
		checker2.diplayResult();
	}

}
