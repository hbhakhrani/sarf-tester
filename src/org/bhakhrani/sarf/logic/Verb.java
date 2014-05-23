package org.bhakhrani.sarf.logic;
import java.util.ArrayList;

import org.bhakhrani.sarf.logic.tables.Mudaari;


public class Verb 
{
	private Baab baab;
	private char فPosition; 
	private char عPosition;
	private char لPoistion;
	private ArrayList<Character> letters = new ArrayList<Character>();
	private String فWithHarakhMaadi;
	private String عWithHarakhMaadi;
	private String لWithHarakhMaadi;
	//private String فWithHarakhMudaari;
	//private String عWithHarakhMudaari;
	//private String لWithHarakhMudaari;
	private String definition;
	//private String verb;
	//private String maadiBase;
	//private String mudaariBase;
	
	public Verb(Baab baab, char فPosition, char عPosition, char لPoistion,
			String definition) 
	{
		this.baab = baab;
		this.فPosition = فPosition;
		this.عPosition = عPosition;
		this.لPoistion = لPoistion;
		this.definition = definition;
		addToBaab();
	}

	public Verb(Baab baab, String verb, String definition)
	{
		this.baab = baab;
//		consider using enumerated types
//		System.out.println("Verb string input is: " + verb);
		فPosition = verb.charAt(0);
		عPosition = verb.charAt(1);
		لPoistion = verb.charAt(2);
		letters.add(فPosition);
		letters.add(عPosition);
		letters.add(لPoistion);
		this.definition = definition;
		addToBaab();
	}
	
	public String maadiBase()
	{
//		ArrayList<String> maadiAffixes = baab.getMaadiAffixes();
//		String  maddiBase = maadiAffixes.get(0);
//		int i =1;
//		
//		for(int j = 0; j<letters.size(); j++)
//		{
////			System.out.println(letters.get(i));
////			System.out.println(maadiHarakat.get(i));
////			System.out.println("---");
//			maddiBase += letters.get(j);
//			if(i <= maadiAffixes.size()){
//				maddiBase += maadiAffixes.get(i);
//			}
//			i++;
//		}
//		System.out.println(maadiMajhoolBase()); //Test for maadi majhool
////		System.out.println("end word");
//		return maddiBase;
		return maadiBase(false);
	}
	
	public String maadiBase(boolean isMajhool){
		ArrayList<String> maadiAffixes = baab.getMaadiAffixes();
		int j=0;
	if(isMajhool){
		for(int i =0; i< maadiAffixes.size()-2; i++){
			maadiAffixes.set(i, maadiAffixes.get(i).replace('َ','ُ'));
			maadiAffixes.set(i, maadiAffixes.get(i).replace('ِ','ُ'));
		}
		maadiAffixes.set(2, maadiAffixes.get(2).replace('ُ', 'ِ'));
		maadiAffixes.set(2, maadiAffixes.get(2).replace('َ', 'ِ'));
		for(int i=1; i<maadiAffixes.size()-1; i++){
			//maadiAffixes.get(i).replace('ا','و');
			for(char c: maadiAffixes.get(i).toCharArray()){
				if(c=='ا'){
					String withWaw = maadiAffixes.get(i).substring(0, j)+"وْ"
							+maadiAffixes.get(i).substring(j+1);
					maadiAffixes.set(i, withWaw);
				}
				j++;
			}
			j=0;
		}
	}
		String  maadiBase = maadiAffixes.get(0);
		j =1;
		
		for(int i = 0; i<letters.size(); i++)
		{
//			System.out.println(letters.get(i));
//			System.out.println(maadiHarakat.get(i));
//			System.out.println("---");
			maadiBase += letters.get(i);
			if(j <= maadiAffixes.size()){
				maadiBase += maadiAffixes.get(j);
			}
			j++;
		}
		return maadiBase;
	}
	public String mudaariBase(){
		return mudaariBase(false);
	}
	public String mudaariBase(boolean isMajhool)
	{
		String mudaariBase = "";
		ArrayList<String> mudaariAffixes = baab.getMudaariAffixes();
		if(isMajhool){
			String tmp = mudaariAffixes.get(0).substring(0, 1) + 'ُ'
				+ mudaariAffixes.get(0).substring(2);
			mudaariAffixes.set(0, tmp);
			mudaariAffixes.set(2, mudaariAffixes.get(2).replace('ِ', 'َ'));
		}
		
		mudaariBase = mudaariAffixes.get(0);
		int i =1;
		
		for(int j = 0; j<letters.size(); j++)
		{
			mudaariBase += letters.get(j);
			mudaariBase += mudaariAffixes.get(i);
			i++;
		}
		
		mudaariBase = mudaariBase.substring(1);
		return mudaariBase;
	}
	
	public void addToBaab()
	{
		baab.addWord(this);
	}
	
	public String toString()
	{
		String toString = "Baab: " + baab.getName() + "\n";
		toString += "Verb: ";
		for(int i=0; i<letters.size(); i++)
		{
			toString += letters.get(i) + " ";
		}
		toString += "\nDefinition: " + definition;
		return toString;
		
	}

	public Baab getBaab() {
		return baab;
	}

	public char getفPosition() {
		return فPosition;
	}

	public char getعPosition() {
		return عPosition;
	}

	public char getلPoistion() {
		return لPoistion;
	}

	public String getDefinition() {
		return definition;
	}

	public String getVerb() {
		String maadi = this.maadiBase();
		String mudaari = Mudaari.conjugate(1, this);
		String toReturn = maadi + " " + mudaari;
		return toReturn;
	}

	public String getفWithHarakh() {
		return فWithHarakhMaadi;
	}

	public void setفWithHarakh(String فWithHarakh) {
		this.فWithHarakhMaadi = فWithHarakh;
	}

	public String getعWithHarakh() {
		return عWithHarakhMaadi;
	}

	public void setعWithHarakh(String عWithHarakh) {
		this.عWithHarakhMaadi = عWithHarakh;
	}

	public String getلWithHarakh() {
		return لWithHarakhMaadi;
	}

	public void setلWithHarakh(String لWithHarakh) {
		this.لWithHarakhMaadi = لWithHarakh;
	}
	
	
	
	
	
}
