/**
 * * ----- Java Strings -----
 * ------------------ ========    ----------------------------------------------
 *     String is a sequence of characters
 * *   But in Java, string is an object that represents a sequence of characters
 * 
 *~       How to create a string object?
 *!              There are two ways to create String object:
 *~                   1. By string literal ---> Java String literal is created by using double quotes
 *~                             Example:  
 *~                                   String text = "Hello";
 *~                   2. By new keyword
 *~                            Example:
 *~                                  String s=new String("Welcome");     //creates two objects and one 
 *~                                                                                            reference variable  
 *  strings are used for string text
 *  A string variable contains a collection of characters surrounded by double quotes
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
            // Example:- toUpperCase(), toLowerCase, charAt(), compareToIgnoreCase(), e.t.c:...
            String txt1 = "Hello world, Java!";

            System.out.println("Length of txt1 is: " + txt1.length());
            System.out.println("Capital letters: " + txt1.toUpperCase());
            System.out.println("Small letters: " + txt1.toLowerCase());

        //~ Finding a character in a string 
            //* indexOf() method --> returns the position (index) of the first character of 
            //* a text in the string --- including whitespaces
            // example below
            String txt21 = "Please locate where 'locate' occurs!";
            System.out.println(txt21.indexOf("locate"));   // Outputs: 7 (position of 'locate')

        //
    }
}
