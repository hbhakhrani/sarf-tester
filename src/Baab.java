import java.util.ArrayList;


public class Baab 
{
	private String name;
	
	private char فPositionHarakahMaadi; 
	private char عPositionHarakahMaadi;
	private char لPositionHarakahMaadi;
	private ArrayList<Character> maadiHarakat = new ArrayList<Character>();
	
	private char فPositionHarakahMudaari; 
	private char عPositionHarakahMudaari;
	private char لPositionHarakahMudaari;
	private ArrayList<Character> mudaariHarakat = new ArrayList<Character>();
	
	private ArrayList<Character> positions = new ArrayList<Character>();
	
	private ArrayList<Verb> wordsOfBaab = new ArrayList<Verb>();
	private char[] lettersOfName;
	
	private int baabNumber;
	
	public Baab(String baabName, int baabNum) 
	{
		name = baabName;
		baabNumber = baabNum;
		lettersOfName = name.toCharArray();
		if (baabNumber != 0)
		{
//			get the harakat of the positoins from the name string
			فPositionHarakahMaadi = name.charAt(5);
			عPositionHarakahMaadi = name.charAt(7);
			لPositionHarakahMaadi = name.charAt(9);
			فPositionHarakahMudaari = name.charAt(14);
			عPositionHarakahMudaari = name.charAt(16);
			لPositionHarakahMudaari = name.charAt(18);
			
//			store the maadi harakat seperatly
			maadiHarakat.add(فPositionHarakahMaadi);
			maadiHarakat.add(عPositionHarakahMaadi);
			maadiHarakat.add(لPositionHarakahMaadi);
//			store the mudaari harakat seperatly
			mudaariHarakat.add(فPositionHarakahMudaari);
			mudaariHarakat.add(عPositionHarakahMudaari);
			mudaariHarakat.add(لPositionHarakahMudaari);
			
			positions.addAll(maadiHarakat);
			positions.addAll(mudaariHarakat);
			
		}
	}
//	public void maadi(Verb word)
//	{
//		فPositionHarakahMaadi = "َ";
//		word.setفWithHarakh(word.getفPosition() + فPositionHarakahMaadi);
//		word.setعWithHarakh(word.getعPosition() + عPositionHarakahMaadi);
//		word.setلWithHarakh(word.getلPoistion()+لPoistionHarakahMaadi);
//	}

	public void addWord(Verb crntVerb)
	{
		wordsOfBaab.add(crntVerb);
	}
	
	public int size()
	{
		return wordsOfBaab.size();
	}
	
	public String toString()
	{
//		System.out.println("Baab toString accessed, size of lettersOfName = " + lettersOfName.length);
		String toString = "";
		for(int i=0; i< lettersOfName.length; i++)
		{
			String temp = "Letter " + i + " is " + lettersOfName[i] + "\n";
//			System.out.println(temp);
			toString += temp;
		}
		toString+= "\nHarakat are:\n";
		
		for(int i=0; i<positions.size(); i++)
		{
			toString+= "Harakah " + i + " is " + positions.get(i) + "\n";
		}
//		System.out.println(toString);
		return toString;
	}

	public String getName() {
		return name;
	}

	public char getفPositionHarakahMaadi() {
		return فPositionHarakahMaadi;
	}

	public char getعPositionHarakahMaadi() {
		return عPositionHarakahMaadi;
	}

	public char getلPositionHarakahMaadi() {
		return لPositionHarakahMaadi;
	}

	public char getفPositionHarakahMudaari() {
		return فPositionHarakahMudaari;
	}

	public char getعPositionHarakahMudaari() {
		return عPositionHarakahMudaari;
	}

	public char getلPositionHarakahMudaari() {
		return لPositionHarakahMudaari;
	}

	public ArrayList<Character> getPositions() {
		return positions;
	}

	public ArrayList<Verb> getWordsOfBaab() {
		return wordsOfBaab;
	}

	public int getBaabNumber() {
		return baabNumber;
	}

	public ArrayList<Character> getMaadiHarakat() {
		return maadiHarakat;
	}

	public ArrayList<Character> getMudaariHarakat() {
		return mudaariHarakat;
	}

	
}
