package org.bhakhrani.sarf.logic;

public class Mudaari extends Table
{
	private String name = "مضارع";
	public static String conjugate(int number, Verb verb)
	{
		String mudaariBase = verb.mudaariBase();
		String shortMudaariBase = mudaariBase.substring(0, mudaariBase.length() - 1);
		String sukoonEnding = shortMudaariBase + "ْ";
		String fathaEnding = shortMudaariBase + "َ";
		String conjugated = "";
		switch(number)
		{
		case 1:
		{
			conjugated = "ي" + mudaariBase;
			break;
		}
		case 2:
		{
			conjugated = "ي" + fathaEnding + "انِ";
			break;
		}
		case 3:
		{
			conjugated = "ي" + mudaariBase + "وْنَ"  ;
			break;
		}
		case 4:
		{
			conjugated = "ت" + mudaariBase;
			break;
		}
		case 5:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 6:
		{
			conjugated = "ي" + sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated ="ت" + mudaariBase;
			break;
		}
		case 8:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 9:
		{
			conjugated = "ت" + mudaariBase + "وْنَ";
			break;
		}
		case 10:
		{
			String temp = shortMudaariBase + "ِ";
			conjugated = "ت" + temp + "يِنَ";
			break;
		}
		case 11:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 12:
		{
			conjugated = "ت" + sukoonEnding + "نَ";
			break;
		}
		case 13:
		{
			conjugated = "أ" + mudaariBase;
			break;
		}
		case 14:
		{
			conjugated = "ن" + mudaariBase;
			break;
		}
		
		}
		
		return conjugated;
	}
	public String conj(int number, Verb verb)
	{
		String mudaariBase = verb.mudaariBase();
		String shortMudaariBase = mudaariBase.substring(0, mudaariBase.length() - 1);
		String sukoonEnding = shortMudaariBase + "ْ";
		String fathaEnding = shortMudaariBase + "َ";
		String conjugated = "";
		switch(number)
		{
		case 1:
		{
			conjugated = "ي" + mudaariBase;
			break;
		}
		case 2:
		{
			conjugated = "ي" + fathaEnding + "انِ";
			break;
		}
		case 3:
		{
			conjugated = "ي" + mudaariBase + "وْنَ"  ;
			break;
		}
		case 4:
		{
			conjugated = "ت" + mudaariBase;
			break;
		}
		case 5:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 6:
		{
			conjugated = "ي" + sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated ="ت" + mudaariBase;
			break;
		}
		case 8:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 9:
		{
			conjugated = "ت" + mudaariBase + "وْنَ";
			break;
		}
		case 10:
		{
			String temp = shortMudaariBase + "ِ";
			conjugated = "ت" + temp + "يِنَ";
			break;
		}
		case 11:
		{
			conjugated = "ت" + fathaEnding + "انِ";
			break;
		}
		case 12:
		{
			conjugated = "ت" + sukoonEnding + "نَ";
			break;
		}
		case 13:
		{
			conjugated = "أ" + mudaariBase;
			break;
		}
		case 14:
		{
			conjugated = "ن" + mudaariBase;
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
