package com.java.gaurang.multilevel;

public class Wordpad extends Notepad {
	private boolean isBold;
	
	public Wordpad()
	{
		super();
		this.isBold=true;
	}
	
	public void formatText(boolean bold)
	{
		if(bold)
		{
			content="<b>"+ content+"</b>";
		}
		isBold=bold;
	}
	public boolean isBold()
	{
		return isBold;
	}
	

}