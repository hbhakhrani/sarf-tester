public class FlashCard 
{
	private String question;
	private String answer;
	private String instructions;

	
	public FlashCard(String quest, String ans, String instruc)
	{
		question = quest;
		answer = ans;
		instructions = instruc;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getInstructions() {
		return instructions;
	}
}
