package javaPack;

public class printletter 
{
    public printletter() {
        // empty constructor
    }

    public void printLettersNTimes(String word, int n)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char letter = word.charAt(i);

            // repeat the letter n times
            for (int count = 0; count < n; count++)
            {
                System.out.print(letter);
            }

            System.out.print(" ");
        }

        System.out.println();
    }
}