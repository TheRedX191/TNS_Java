package com.java.gaurang.palindrome;

public class palindrome{
	public boolean isPalindrome(int num) {
		int rev = 0;
		int og_num = num;
		while(num!=0) {
			rev = (rev*10)+num%10;
			num = num/10;
		}
//		System.out.println(rev);
		return og_num == rev;
	}
	public boolean isPalindrome(String text) {
		String txt = new StringBuffer(text).reverse().toString();
//		System.out.println(txt+text);
		return txt.equals(text);
	}
	
}