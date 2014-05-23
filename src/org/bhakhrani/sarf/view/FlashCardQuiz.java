package org.bhakhrani.sarf.view;

import java.util.ArrayList;
import java.util.Random;

import org.bhakhrani.sarf.logic.Baab;
import org.bhakhrani.sarf.logic.Details;
import org.bhakhrani.sarf.logic.Parser;
import org.bhakhrani.sarf.logic.Table;
import org.bhakhrani.sarf.logic.Verb;
import org.bhakhrani.sarf.logic.tables.Maadi;
import org.bhakhrani.sarf.logic.tables.Mudaari;


public class FlashCardQuiz 
{
	private Random conjGenerator;
	private Random verbPicker;
	private Random tablePicker;
	private Random quizPicker;
	private ArrayList<Verb> allVerbs;
	private ArrayList<Baab> allBaabs;
	private ArrayList<Table> allTables;
	
	
	public FlashCardQuiz(String fileName, ArrayList<Table> tables)
	{
		conjGenerator = new Random();
		verbPicker = new Random();
		tablePicker = new Random();
		quizPicker = new Random();
		allTables = tables;
		Parser ourParser = new Parser(fileName);
		allVerbs = ourParser.getListOfVerbs();
		allBaabs = ourParser.getAllBaabs();
	}
	
	public FlashCard selectQuiz(int quizNum)
	{
		switch(quizNum)
		{
		case 0: return detailsToConj();
		case 2: return maadiToMudaari();
		case 3: return mudaariToMaadi(); 
		case 1: return detailsTester(); 
		case 4: return verbToDef(); 
		case 5: return defToVerb();
		case 6: 
			{
				int randQuizNum = quizPicker.nextInt(5);
				return selectQuiz(randQuizNum);
			}
		}
		return null;
	}
	
	public Verb randomVerb()
	{
		int verbNumber = verbPicker.nextInt(allVerbs.size());
		Verb randVerb = allVerbs.get(verbNumber);
		return randVerb;
	}
	
	public Baab randomBaab()
	{
		Random baabNum = new Random();
		int baabNumber = baabNum.nextInt(allBaabs.size());
		Baab randBaab = allBaabs.get(baabNumber);
		return randBaab;
	}
	
	public FlashCard maadiToMudaari()
	{
		String maadi;
		String mudaari = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		Verb randomVerb = allVerbs.get(verbPick);
		maadi = Maadi.conjugate(conjNumber, randomVerb);
		mudaari = Mudaari.conjugate(conjNumber, randomVerb);
		String instructions = ("Given the following maadi conjugation, find the mudaari conjugation of the same word");
		String question = randomVerb.toString() + "\n" + maadi;
		String answer = mudaari;
		FlashCard card = new FlashCard(question, answer, instructions);
//		printToGUIln(randomVerb.toString());
//		Wait.manySec(3);
//		printToGUIln(maadi);
//		countDown(seconds);
//		printToGUIln(mudaari);
		return card;
	}
	
	public FlashCard mudaariToMaadi()
	{
		String maadi;
		String mudaari = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		Verb randomVerb = allVerbs.get(verbPick);
		maadi = Maadi.conjugate(conjNumber, randomVerb);
		mudaari = Mudaari.conjugate(conjNumber, randomVerb);
		String intructions = ("Given the following mudaari conjugation, find the maadi conjugation of the same word");
		String question = randomVerb.toString() + "\n" + mudaari;
		String answer = maadi;
		FlashCard card = new FlashCard(question, answer, intructions);
		return card;
//		printToGUIln(randomVerb.toString());
//		Wait.manySec(3);
//		printToGUIln(mudaari);
		//countDown(seconds);
//		printToGUIln(maadi);
	}
	
	public FlashCard detailsTester()
	{
		String conjVerb = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		int tableNum = tablePicker.nextInt(2);
//		printToGUIln("Random table number is " + tableNum);
		Table randomTable = allTables.get(tableNum);
		Verb randomVerb = allVerbs.get(verbPick);
		String conjugated = randomTable.conj(conjNumber, randomVerb);
		String instructions = ("Given the following conjugated verb, say the details");
		String question = randomVerb.toString() + "\n" + conjugated;
		String answer = Details.details(conjNumber);
		FlashCard card = new FlashCard(question, answer, instructions);
		return card;
//		printToGUIln("Given the following verb, say the details");
////		printToGUIln(randomVerb);
////		printToGUIln(randomTable.toString());
//		Wait.oneSec();
//		printToGUIln(conjugated);
//		//countDown(seconds);
//		printToGUIln(Details.details(conjNumber));
	}
	
	
	public FlashCard detailsToConj()
	{
		//list root letters, definition, baab, maadi, majhool, wahid, mudhakkar, ghaaib
		int conjNum = conjGenerator.nextInt(14)+1;
		int verbNum = verbPicker.nextInt(allVerbs.size());
		int tableNum = tablePicker.nextInt(2);
		Table table = allTables.get(tableNum);
		Verb verb = allVerbs.get(verbNum);
		String verbDef = verb.getDefinition();
		Baab verbBaab = verb.getBaab();
		String randDetails = Details.details(conjNum);
		String conjVerb = table.conj(conjNum, verb);
		String tableName = table.toString();
		String majhool = "مجهول";
		String maroof = "معروف";
		String instructions = "Given the root letters and the details, say the conjugated Verb";
		String question = (verb.toString()) + "\n";
//		System.out.println(verb.toString());
//		Wait.manySec(3);
		question += (tableName + " --- " + maroof);
//		System.out.println(majhool);
		question += "\n" + (randDetails.toString());
		//countDown(seconds);
//		printToGUIln(conjVerb);
		String answer = conjVerb;
		FlashCard card = new FlashCard(question, answer, instructions);
		return card;
	}
	
	private FlashCard defToVerb()
	{
		Verb crntVerb = randomVerb();
		String instruction = ("Given the definitions, say the arabic verb");
		String question = ("Definition: " + crntVerb.getDefinition());
		//countDown(seconds);
		String answer = (crntVerb.getVerb());
		FlashCard card = new FlashCard(question, answer, instruction);
		return card;
	}
	
	private FlashCard verbToDef()
	{
		Verb crntVerb = randomVerb();
		String instructions = ("Given the arabic verb, say the definition");
		String question = (crntVerb.getVerb());
		//countDown(seconds);
		String answer = ("Definition: " + crntVerb.getDefinition());
		FlashCard card = new FlashCard(question, answer, instructions);
		return card;
	}

}
