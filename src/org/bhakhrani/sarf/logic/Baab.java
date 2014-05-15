package org.bhakhrani.sarf.logic;
import java.util.ArrayList;
import java.util.Arrays;

public class Baab 
{
	private String name;
	private String maadi;
	private String mudaari;
	
	private boolean isMazeed = false;
//	private String prefix;
//	private String infix1;
//	private String infix2;
//	private String suffix;
//	
//	private String فPositionHarakahMaadi; 
//	private String عPositionHarakahMaadi;
//	private String لPositionHarakahMaadi;
//	private ArrayList<String> maadiHarakat = new ArrayList<String>();
//	
//	private String فPositionHarakahMudaari; 
//	private String عPositionHarakahMudaari;
//	private String لPositionHarakahMudaari;
	private ArrayList<String> maadiAffixes = new ArrayList<String>();
	private ArrayList<String> mudaariAffixes = new ArrayList<String>();
	
	private ArrayList<String> positions = new ArrayList<String>();
	
	private ArrayList<Verb> wordsOfBaab = new ArrayList<Verb>();
	private char[] lettersOfName;
	
	private int baabNumber;
	
	public Baab(String baabName) 
	{
		name = baabName;
		lettersOfName = name.toCharArray();
		maadi = name.split(" ")[1];
		mudaari = name.split(" ")[2];
		
		mudaariAffixes = new ArrayList(Arrays.asList(mudaari.split("[فعل]")));
		maadiAffixes = new ArrayList(Arrays.asList(maadi.split("[فعل]")));
		
		int maadAffSize = maadiAffixes.size();
		for(int i = 0; i< maadAffSize; i++){
			if(maadiAffixes.get(i).length() >1){
				isMazeed = true;
			}
		}
		
			
//			int numRootsPassed = 0;
//			int i = 0;
//			for(char c: maadi.toCharArray()){
//				if(!isHarakah(c) && numRootsPassed==0){
//					prefix += c;
//				}
//				else if(!isHarakah(c) && numRootsPassed==1){
//					infix1 += c;
//				}
//				else if(!isHarakah(c) && numRootsPassed==2){
//					infix2 += c;
//				}
//				else if(!isHarakah(c) && numRootsPassed==3){
//					suffix += c;
//				}
//				else if(c == 'ف')
//				{}
//				i++;
//			}
////			get the harakat of the positoins from the name string
//			فPositionHarakahMaadi = name.charAt(5);
//			عPositionHarakahMaadi = name.charAt(7);
//			لPositionHarakahMaadi = name.charAt(9);
//			فPositionHarakahMudaari = name.charAt(14);
//			عPositionHarakahMudaari = name.charAt(16);
//			لPositionHarakahMudaari = name.charAt(18);
			
////			store the maadi harakat seperatly
//			maadiHarakat.add(فPositionHarakahMaadi);
//			maadiHarakat.add(عPositionHarakahMaadi);
//			maadiHarakat.add(لPositionHarakahMaadi);
////			store the mudaari harakat seperatly
//			mudaariHarakat.add(فPositionHarakahMudaari);
//			mudaariHarakat.add(عPositionHarakahMudaari);
//			mudaariHarakat.add(لPositionHarakahMudaari);
//			
//			positions.addAll(maadiHarakat);
//			positions.addAll(mudaariHarakat);
			
		//}
	}
	public String getHarakah(String word){
		String harakah = "";
		for(char c: word.toCharArray()){
			if(isHarakah(c)){
				harakah += c;
			}
			else{
				return harakah;
			}
		}
		return harakah;
	}
	public boolean isHarakah(char letter){
		String harakat = " َُِّْ";
		for(char c: harakat.toCharArray()){
			if(letter == c){
				return true;
			}
		}
		return false;
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

	public ArrayList<Verb> getWordsOfBaab() {
		return wordsOfBaab;
	}

	public ArrayList<String> getMaadiAffixes() {
		return maadiAffixes;
	}

	public ArrayList<String> getMudaariAffixes() {
		return mudaariAffixes;
	}

	
}
