import java.util.ArrayList;


public class ParseTester 
{

	/**
	 * @param args
	 */
	private Parser testParser;
	private final String fileName = "Verb_List_Formatted_txt.txt";
	private String text = "";
	
	public static void main(String[] args) 
	{
		ParseTester test = new ParseTester();
		test.testPrint();
	}
	
	public ParseTester()
	{
		testParser = new Parser(fileName);
	}
	
	public String allText()
	{
		return testParser.getAllText();
	}
	
	public String testPrint()
	{
//		testParser = new Parser(fileName);
		ArrayList<Baab> baabs = testParser.getAllBaabs();
		ArrayList<Verb> verbs = testParser.getListOfVerbs();
		
		for(int i=0; i<baabs.size(); i++)
		{
			Baab crnt = baabs.get(i);
			text += "\n" +(crnt.getName());
			String baabName = crnt.getName();
			text += "\n" +("----------------\n----------------");
//			crnt.toString();
//			char[] lettersOfName = baabName.toCharArray();
//			for(char c : lettersOfName)
//			{
//				System.out.print(c + ", ");
//			}
//			text += "\n" +();
			text += "\n" +(crnt.toString());
//			for(Verb verb : crnt.getWordsOfBaab())
//			{
////				text += "\n" +(verb.toString() + "\n");
////				text += "\n" +(verb.maadiBase());
//				for(int j=1; j<=14; j++)
//				{
//					System.out.print(Maadi.conjugate(j, verb));
//					text += "\n" +(":\t"+ Details.details(j));
//				}
//				text += "\n" +("***");
////				text += "\n" +(Mudaari.conjugate(1, verb));
//				for(int j=1; j<=14; j++)
//				{
//					System.out.print(Mudaari.conjugate(j, verb));
//					text += "\n" +(":\t"+ Details.details(j));
//				}
//				
//				text += "\n" +();
//			}
			text += "\n" ;
		}
		System.out.println(text);
		return text;
	}

}
