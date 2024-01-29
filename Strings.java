/**
 * * ----- Java Strings -----
 * ----------------------------------------------------------------
 *   strings are used for string text
 *   A string variable contains a collection of characters surrounded by double quotes
 * ^  Example;
 * ~      String greeting = "Hello, Eric!"
 * 
 */
public class Strings 
{
    public static void main(String[] args)
    {
        //~ String Length
            // length() method : 
            String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String name = "Eric Nzyoka";

            System.out.println("Length of txt string is: " + txt.length()); // length is 26 letters
            System.out.println("Lenght of name string is: " + name.length()); // length is 11 
        
        //~ More String methods
            // Example:- toUpperCase(), toLowerCase etc...
            String txt1 = "Hello world, Java!";

            System.out.println("Length of txt1 is: " + txt1.length());
            System.out.println("Capital letters: " + txt1.toUpperCase());
            System.out.println("Small letters: " + txt1.toLowerCase());

        //~ Finding a character in a string 
            //* indexOf() method --> returns the position (index) of the first character of 
            //* a text in the string --- including whitespaces
            // example below
            
    
    }
}
