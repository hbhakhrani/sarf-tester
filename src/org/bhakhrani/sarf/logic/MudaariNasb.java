package org.bhakhrani.sarf.logic;

public class MudaariNasb extends Table
{
	private String name = "مضارع منصوب بلن";
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
			conjugated = "لن ي" + fathaEnding;
			break;
		}
		case 2:
		{
			conjugated = "لن ي" + fathaEnding + "ا";
			break;
		}
		case 3:
		{
			conjugated = "لن ي" + mudaariBase + "وْ"  ;
			break;
		}
		case 4:
		{
			conjugated = "لن ت" + fathaEnding;
			break;
		}
		case 5:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 6:
		{
			conjugated = "لن ي" + sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated ="لن ت" + fathaEnding;
			break;
		}
		case 8:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 9:
		{
			conjugated = "لن ت" + mudaariBase + "وْ";
			break;
		}
		case 10:
		{
			String temp = shortMudaariBase + "ِ";
			conjugated = "لن ت" + temp + "يِ";
			break;
		}
		case 11:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 12:
		{
			conjugated = "لن ت" + sukoonEnding + "نَ";
			break;
		}
		case 13:
		{
			conjugated = "لن أ" + fathaEnding;
			break;
		}
		case 14:
		{
			conjugated = "لن ن" + fathaEnding;
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
			conjugated = "لن ي" + fathaEnding;
			break;
		}
		case 2:
		{
			conjugated = "لن ي" + fathaEnding + "ا";
			break;
		}
		case 3:
		{
			conjugated = "لن ي" + mudaariBase + "وْ"  ;
			break;
		}
		case 4:
		{
			conjugated = "لن ت" + fathaEnding;
			break;
		}
		case 5:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 6:
		{
			conjugated = "لن ي" + sukoonEnding + "نَ";
			break;
		}
		case 7:
		{
			conjugated ="لن ت" + fathaEnding;
			break;
		}
		case 8:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 9:
		{
			conjugated = "لن ت" + mudaariBase + "وْ";
			break;
		}
		case 10:
		{
			String temp = shortMudaariBase + "ِ";
			conjugated = "لن ت" + temp + "يِ";
			break;
		}
		case 11:
		{
			conjugated = "لن ت" + fathaEnding + "ا";
			break;
		}
		case 12:
		{
			conjugated = "لن ت" + sukoonEnding + "نَ";
			break;
		}
		case 13:
		{
			conjugated = "لن أ" + fathaEnding;
			break;
		}
		case 14:
		{
			conjugated = "لن ن" + fathaEnding;
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
