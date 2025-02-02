import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Ciaran Byrne
 * @version    0.1 (2016.02.29)
 * 
 * Modified by Ciaran Byrne
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public String getString(String prompt)
    {
        reader = new Scanner(System.in);
        
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt);         // print prompt
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nYour input is blank!\n");
        }

        return inputLine;
    }
    
    /**
     * Read a the next int from standard imput (the text terminal),
     * and return it as an interger.
     * 
     * @return Integer typed by user.
     */
    public int getInt(String prompt)
    {
        reader = new Scanner(System.in);
        
        int number = 0;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.println(prompt);         // print prompt
            number = reader.nextInt();
            
            if(number > 0)
            {
                isValid = true;
            }
            else 
                System.out.println("Your value is less than zero!");
        }

        return number;
    }
}