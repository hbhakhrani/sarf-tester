package org.bhakhrani.sarf.logic;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import javax.swing.JTextArea;

import org.bhakhrani.sarf.logic.tables.Maadi;
import org.bhakhrani.sarf.logic.tables.Mudaari;
import org.bhakhrani.sarf.view.SarfGUI;
import org.bhakhrani.sarf.view.Wait;


public class Quiz 
{
	private Random conjGenerator;
	private Random verbPicker;
	private Random tablePicker;
	private Random quizPicker;
	private ArrayList<Verb> allVerbs;
	private ArrayList<Baab> allBaabs;
	private ArrayList<Table> allTables;
	private int seconds;
	private JTextArea textBox;
	private SarfGUI gui;
	
	public Quiz(String fileName, ArrayList<Table> tables, int difficulty, JTextArea textArea, SarfGUI gui)
	{
		Parser parse = new Parser(fileName);
		allVerbs = parse.getListOfVerbs();
		allBaabs = parse.getAllBaabs();
		conjGenerator = new Random();
		verbPicker = new Random();
		tablePicker = new Random();
		quizPicker = new Random();
		allTables = tables;
		seconds = difficulty;
		textBox = textArea;
		this.gui = gui;
	}
	
	public Quiz(String fileName, ArrayList<Table> tables)
	{
		Parser parse = new Parser(fileName);
		allVerbs = parse.getListOfVerbs();
		allBaabs = parse.getAllBaabs();
		allTables = tables;
	}
	
	public void selectQuiz(int quizNum)
	{
		switch(quizNum)
		{
		case 0: detailsToConj(); break;
		case 2: maadiToMudaari(); break;
		case 3: mudaariToMaadi(); break;
		case 1: detailsTester(); break;
		case 4: verbToDef(); break;
		case 5: defToVerb(); break;
		case 6: randomQuiz(); break;
		}
	}
	
	public void randomQuiz()
	{
		int  quizNum = quizPicker.nextInt(3);
		switch(quizNum)
		{
		case 0: maadiToMudaari(); break;
		case 1: mudaariToMaadi(); break;
		case 2: detailsTester(); break;
		}
	}
	
	public Verb randomVerb()
	{
		Random verbNum = new Random();
		int verbNumber = verbNum.nextInt(allVerbs.size());
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
	
	public void maadiToMudaari()
	{
		String maadi;
		String mudaari = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		Verb randomVerb = allVerbs.get(verbPick);
		maadi = Maadi.conjugate(conjNumber, randomVerb);
		mudaari = Mudaari.conjugate(conjNumber, randomVerb);
		printToGUIln("Given the following maadi conjugation, find the mudaari conjugation of the same word");
		printToGUIln(randomVerb.toString());
		Wait.manySec(3);
		printToGUIln(maadi);
		countDown(seconds);
		printToGUIln(mudaari);
	}
	
	public void mudaariToMaadi()
	{
		String maadi;
		String mudaari = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		Verb randomVerb = allVerbs.get(verbPick);
		maadi = Maadi.conjugate(conjNumber, randomVerb);
		mudaari = Mudaari.conjugate(conjNumber, randomVerb);
		printToGUIln("Given the following mudaari conjugation, find the maadi conjugation of the same word");
		printToGUIln(randomVerb.toString());
		Wait.manySec(3);
		printToGUIln(mudaari);
		countDown(seconds);
		printToGUIln(maadi);
	}
	
	public void detailsTester()
	{
		String conjVerb = "";
		int conjNumber = conjGenerator.nextInt(13) + 1;
		int verbPick = verbPicker.nextInt(allVerbs.size());
		int tableNum = tablePicker.nextInt(2);
//		printToGUIln("Random table number is " + tableNum);
		Table randomTable = allTables.get(tableNum);
		Verb randomVerb = allVerbs.get(verbPick);
		String conjugated = randomTable.conj(conjNumber, randomVerb);
		printToGUIln("Given the following verb, say the details");
//		printToGUIln(randomVerb);
//		printToGUIln(randomTable.toString());
		Wait.oneSec();
		printToGUIln(conjugated);
		countDown(seconds);
		printToGUIln(Details.details(conjNumber));
	}
	
	public void detailsToConj()
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
		printToGUIln(verb.toString());
		Wait.manySec(3);
		printToGUIln(tableName + " --- " + maroof);
//		System.out.println(majhool);
		printToGUIln(randDetails);
		countDown(seconds);
		printToGUIln(conjVerb);
	}
	
	private void defToVerb()
	{
		Verb crntVerb = randomVerb();
		printToGUIln("Given the definitions, say the arabic verb");
		printToGUIln("Definition: " + crntVerb.getDefinition());
		countDown(seconds);
		printToGUIln(crntVerb.getVerb());
	}
	
	private void verbToDef()
	{
		Verb crntVerb = randomVerb();
		printToGUIln("Given the arabic verb, say the definition");
		printToGUIln(crntVerb.getVerb());
		countDown(seconds);
		printToGUIln("Definition: " + crntVerb.getDefinition());
	}
	
	private void printToGUIln(String newLine)
	{
		System.out.println(newLine);
//		gui.
//		textBox.setText(newLine);
//		textBox.setText("test");
//		textBox.repaint();
		
		gui.printToGUIln(newLine);
	}
	
	public void countDown(int seconds)
	{
		double startTime = System.currentTimeMillis()/1000;//timeInMS;
		double endTime = startTime + seconds;
		double crntTime = startTime;
		double nextSecond = crntTime + 1;
		int secondsRemaining = seconds;
		printToGUIln("Time Remaining:");//+ secondsRemaining);
//		Timer timer = new Timer();
		while(crntTime <= endTime)
		{
			if(nextSecond <= crntTime)
			{
				printToGUIln(secondsRemaining + "");
				secondsRemaining--;
				nextSecond++;
			}
			crntTime = System.currentTimeMillis()/1000;
		}
		printToGUIln("Time's Up!");
		return;
	}
}

