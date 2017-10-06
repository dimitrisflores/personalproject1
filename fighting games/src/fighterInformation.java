import java.util.ArrayList;
public class fighterInformation
	{

		static ArrayList<fighter> fightInformation = new ArrayList<fighter>();
		public static void fillFighterInformation()
			{
			fightInformation.add(new fighter("Bigboy", 12, 4, 6, 8));
			fightInformation.add(new fighter("Assasin", 10, 7, 4, 6));
			fightInformation.add(new fighter("Tank", 20, 3, 8, 10));
			fightInformation.add(new fighter("Pickle Rick", 23, 12, 7,9));
			fightInformation.add(new fighter("Goku", 18, 15, 9, 11));
			}	
	}
