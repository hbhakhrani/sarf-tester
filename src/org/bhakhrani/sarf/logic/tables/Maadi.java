package org.bhakhrani.sarf.logic.tables;

import org.bhakhrani.sarf.logic.Table;
import org.bhakhrani.sarf.logic.Verb;

public class Maadi extends Table
{
	private String name = "ماضي";
	public static String conjugate(int number, Verb verb)
	{
		String maadiBase = verb.maadiBase();
		String shortMaadiBase = maadiBase.substring(0, maadiBase.length() - 1);
		String sukoonEnding = shortMaadiBase + "ْ";
		String conjugated = "";
		switch(number)
		{
		case 1:
		{
			conjugated = maadiBase;
			break;
		}
		case 2:
		{
			conjugated = maadiBase + "ا";
			break;
		}
		case 3:
		{
			conjugated = sukoonEnding + "وْا"  ;
			break;
		}
		case 4:
		{
			conjugated = maadiBase + "تْ";
			break;
		}
		case 5:
		{
			conjugated = maadiBase + "تَا";
			break;
		}
		case 6:
		{
			conjugated = sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated = sukoonEnding + "تَ";
			break;
		}
		case 8:
		{
			conjugated = sukoonEnding + "تُمَا";
			break;
		}
		case 9:
		{
			conjugated = sukoonEnding + "تُمْ";
			break;
		}
		case 10:
		{
			conjugated = sukoonEnding + "تِ";
			break;
		}
		case 11:
		{
			conjugated = sukoonEnding + "تُمَا";
			break;
		}
		case 12:
		{
			conjugated = sukoonEnding + "تُنَّّ";
			break;
		}
		case 13:
		{
			conjugated = sukoonEnding + "تُ";
			break;
		}
		case 14:
		{
			conjugated = sukoonEnding + "نَا";
			break;
		}
		
		}
		
		return conjugated;
	}
	public String conj(int number, Verb verb)
	{
		String maadiBase = verb.maadiBase();
		String shortMaadiBase = maadiBase.substring(0, maadiBase.length() - 1);
		String sukoonEnding = shortMaadiBase + "ْ";
		String conjugated = "";
		switch(number)
		{
		case 1:
		{
			conjugated = maadiBase;
			break;
		}
		case 2:
		{
			conjugated = maadiBase + "ا";
			break;
		}
		case 3:
		{
			conjugated = sukoonEnding + "وْا"  ;
			break;
		}
		case 4:
		{
			conjugated = maadiBase + "تْ";
			break;
		}
		case 5:
		{
			conjugated = maadiBase + "تَا";
			break;
		}
		case 6:
		{
			conjugated = sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated = sukoonEnding + "تَ";
			break;
		}
		case 8:
		{
			conjugated = sukoonEnding + "تُمَا";
			break;
		}
		case 9:
		{
			conjugated = sukoonEnding + "تُمْ";
			break;
		}
		case 10:
		{
			conjugated = sukoonEnding + "تِ";
			break;
		}
		case 11:
		{
			conjugated = sukoonEnding + "تُمَا";
			break;
		}
		case 12:
		{
			conjugated = sukoonEnding + "تُنَّّ";
			break;
		}
		case 13:
		{
			conjugated = sukoonEnding + "تُ";
			break;
		}
		case 14:
		{
			conjugated = sukoonEnding + "نَا";
			break;
		}
		
		}
		
		return conjugated;
	}
	
	public String toString()
	{
		return name;
	}
	
}
