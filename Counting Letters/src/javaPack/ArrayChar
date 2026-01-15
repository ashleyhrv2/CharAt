package javaPack;
import java.util.Scanner;

public class ArrayChar extends MainProgram
{
	Scanner allinput = new Scanner(System.in);
	
	public void ArrayChar()
	{
		AcceptInfo();
	}
	
	public void AcceptInfo()
	{
		float numletters = allinput.nextFloat();
		if(numletters % 1 !=0)
		{
			System.out.print("Incorrect value has been entered.\n");
			MainProgram.main(null);
		}
		else
		{
			allinput.nextLine();
			System.out.print("Enter a word: ");
			String wordent = allinput.nextLine();
			CheckWord1(wordent);
		}
	}
		
	private void CheckWord1(String entword)
	{
		int wordlen = entword.length();
		if (wordlen == 0)
		{
			MainProgram.main(null);
		}
		else
		{
			char[] wordarray = new char[wordlen];
			for(int i=0; i<wordlen; i++)
			{
				wordarray[i] = entword.charAt(i);
				
				if((int)wordarray[i] <= 96 || (int)wordarray[i] >=123)
				{
					System.out.print(wordarray[i] + "is not a letter!\n");
				}
				else
				{
					System.out.print(wordarray[i] + "is a letter!\n");
					printletter allinfo = new printletter();
				}
			}
		}
	}
}

