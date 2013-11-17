import java.util.Random;


public class Details 
{
	private int plurality;
	private int gender;
	private int person;
	
	public Details(int plur, int gen, int per)
	{
		plurality = plur;
		gender = gen;
		person = per;
	}
	
	public static String details(int conjNumber)
	{
		String details = "";
		details = plurality(conjNumber) + "---" + gender(conjNumber) + "---" + person(conjNumber);
		
		return details;
	}
	
	public String details(int plur, int gen, int per)
	{
		String pluralityString = plurality(plurality);
		String genderString = gender(gender);
		String personString = person(person);
		String details = pluralityString + "---" + genderString + "---" + personString;
		return details;
	}
	
	public String randDetails()
	{
		Random conjPicker = new Random();
		String plurality = plurality(conjPicker.nextInt(14));
		String gender = gender(conjPicker.nextInt(14));
		String person = person(conjPicker.nextInt(14));
		String details = plurality + "---" + gender + "---" + person;
		return details;
	}
	
	public static String plurality(int conjNumber)
	{
		String pluarilty = "";
		switch(conjNumber)
		{
		case 1:
		{
			pluarilty = "واحد";
			break;
		}
		case 2:
		{
			pluarilty = "تثني";
			break;
		}
		case 3:
		{
			pluarilty = "جمع";
			break;
		}
		case 4:
		{
			pluarilty = "واحد";
			break;
		}
		case 5:
		{
			pluarilty = "تثني";
			break;
		}
		case 6:
		{
			pluarilty = "جمع";
			break;
		}		
		case 7:
		{
			pluarilty = "واحد";
			break;
		}
		case 8:
		{
			pluarilty = "تثني";
			break;
		}
		case 9:
		{
			pluarilty = "جمع";
			break;
		}
		case 10:
		{
			pluarilty = "واحد";
			break;
		}
		case 11:
		{
			pluarilty = "تثني";
			break;
		}
		case 12:
		{
			pluarilty = "جمع";
			break;
		}		
		case 13:
		{
			pluarilty = "واحد";
			break;
		}
		case 14:
		{
			pluarilty = "جمع";
			break;
		}
		}
		return pluarilty;
	}
	
	public static String gender(int conjNumber)
	{
		String gender = "";
		switch(conjNumber)
		{
		case 1:
		{
			gender = "مذكر";
			break;
		}
		case 2:
		{
			gender = "مذكر";
			break;
		}
		case 3:
		{
			gender = "مذكر";
			break;
		}
		case 4:
		{
			gender = "مأنث";
			break;
		}
		case 5:
		{
			gender = "مأنث";
			break;
		}
		case 6:
		{
			gender = "مأنث";
			break;
		}		
		case 7:
		{
			gender = "مذكر";
			break;
		}
		case 8:
		{
			gender = "مذكر";
			break;
		}
		case 9:
		{
			gender = "مذكر";
			break;
		}
		case 10:
		{
			gender = "مأنث";
			break;
		}
		case 11:
		{
			gender = "مأنث";
			break;
		}
		case 12:
		{
			gender = "مأنث";
			break;
		}		
		case 13:
		{
			gender = "مذكر و مؤنث";
			break;
		}
		case 14:
		{
			gender = "مذكر و مؤنث";
			break;
		}
		}
		return gender;
	}
	public static String person(int conjNumber)
	{
		String person = "";
		switch(conjNumber)
		{
		case 1:
		{
			person = "غاإب";
			break;
		}
		case 2:
		{
			person = "غاإب";
			break;
		}
		case 3:
		{
			person = "غاإب";
			break;
		}
		case 4:
		{
			person = "غاإب";
			break;
		}
		case 5:
		{
			person = "غاإب";
			break;
		}
		case 6:
		{
			person = "غاإب";
			break;
		}		
		case 7:
		{
			person = "حاضر";
			break;
		}
		case 8:
		{
			person = "حاضر";
			break;
		}
		case 9:
		{
			person = "حاضر";
			break;
		}
		case 10:
		{
			person = "حاضر";
			break;
		}
		case 11:
		{
			person = "حاضر";
			break;
		}
		case 12:
		{
			person = "حاضر";
			break;
		}		
		case 13:
		{
			person = "متكلم";
			break;
		}
		case 14:
		{
			person = "متكلم";
			break;
		}
		}
		return person;
	}
	
}
