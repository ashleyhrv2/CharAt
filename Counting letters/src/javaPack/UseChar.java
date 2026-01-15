package javaPack;
import java.util.Scanner;

public class UseChar 
{
    Scanner allinput = new Scanner(System.in);

    public UseChar()
    {
        System.out.print("Enter a word: ");
        String vowelword = allinput.nextLine();

        System.out.print("Enter a number: ");
        int n = allinput.nextInt();

        // Create LetterPrinter object
        printletter printer = new printletter();
        printer.printLettersNTimes(vowelword, n);

        // Optional: vowel count
        int numvowels = CountVowels(vowelword);
        System.out.println("The number of vowels are: " + numvowels);
    }

    private static int CountVowels(String wordvowel)
    {
        int numofvowels = 0;

        for (int i = 0; i < wordvowel.length(); i++)
        {
            char whichletter = wordvowel.charAt(i);

            switch(whichletter)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    numofvowels++;
                    break;
                default:
                    break;
            }
        }
        return numofvowels;
    }
}