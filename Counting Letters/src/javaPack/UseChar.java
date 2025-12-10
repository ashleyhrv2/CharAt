package javaPack;
import java.util.Scanner;

public class UseChar 
{
	Scanner allinput = new Scanner(System.in);
	public UseChar()
	{
		System.out.print("\nEnter a word: ");
		String vowelword = allinput.nextLine();
		int numvowels = CountVowels(vowelword);
		System.out.println("\nThe number of vowels are: " + numvowels );
	}
	
	private static int CountVowels(String wordvowel)
	{
		int numofvowels=0, wordlen=0, notvowel=0;
		wordlen = wordvowel.length();
		for (int i=0; i<wordlen; i++)
		{
			char whichletter = wordvowel.charAt(i);
			System.out.print(whichletter + " ");
			switch(whichletter)
			{
			case 'a': case 'e': case 'i': case 'o': case 'u':
				numofvowels = numofvowels + 1;
				break;
			default:
				notvowel = notvowel + 1;
				break;
				
			}
		}
		return numofvowels;
	}
	

}
