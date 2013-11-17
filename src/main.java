import java.util.ArrayList;

import javax.swing.JTextArea;


public class main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		System.out.println("فَعَلَ");
//		String test = "ف";
//		test += "َ";
//		System.out.println(test);
		String fileName = "verb_List_Formatted_txt.txt";
//		Parser parser = new Parser(fileName);
		ArrayList<Table> tables = new ArrayList<Table>();
		Table maadi = new Maadi();
		Table mudaari = new Mudaari();
		tables.add(maadi);
		tables.add(mudaari);
		
		//this is modified
		Quiz quiz = new Quiz(fileName, tables, 20, new JTextArea(), new SarfGUI());
		for (int i = 0; i < 1; i++) 
		{
			//		quiz.maadiToMudaari();
			//		quiz.detailsTester();
//			quiz.randomQuiz();
//			Wait.manySec(3);
//			System.out.println();
//		}
			quiz.detailsToConj();
			System.out.println();
			Wait.manySec(3);
		}
	}


}
