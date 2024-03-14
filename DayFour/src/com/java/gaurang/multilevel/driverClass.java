package com.java.gaurang.multilevel;

public class driverClass {

	public static void main(String[] args) {
		Word word=new Word();
		
		word.write("Gaurang ");
		word.formatText(true);
		word.write("Helloo");
		word.displayData();
		
		word.spellCheck();
		word.enableSpellCheck(true);
		System.out.println(word.isBold());
		

	}

}