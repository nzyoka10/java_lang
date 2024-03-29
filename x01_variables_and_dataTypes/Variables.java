/*
 **  =====      Java Variables  =====
 *~ variable is a container for storing data values.
 * Types of variables: 
 *      - String: store text value. i.e:. "value" 
 *      - int: stores integers (whole numbers) without decimal point. i.e:. 2, 67, 894, -45
 *      - float: stores real number with decimal points. i.e:. 19.9 or -2.4
 *      - double: stores real number with decimal points and can have more precision than float. i.e.: 3.1415933......
 *      - char: stores single characters. i.e:. 'a', 'B' --> Char values are surrounded by single quotes
 *      - boolean: stores values with two states; True, False
 *~
 * Syntax:.
 *      type variableName = value;
 * 
 * 
 *  The general rules for naming variables are:
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
 *
 * 
*/

public class Variables 
{
    //String name = "Variables";

    public static void main(String[] args)
    {
        String name = "Eric Nzyoka";
        System.out.println(name);

        // integer value
        int myNumber = 56;

        // replace myNumber with new value
        myNumber = 34;
        System.out.println(myNumber);

        // float value
        float myFloat =  41.07f;
        System.out.println(myFloat);

        // char value
        char myChar = 'B';
        System.out.println(myChar);

        // boolean value
        boolean myBoolean = true;
        System.out.println(myBoolean);

    }
}