/**
 *~ -------- Java Declare Multiple Variables --------------------------------
 *~   Declare many variables
 *^        To declare more than one variable of the same type,
 *^        simply separate them with commas. 
 *~                        For example: 
 **                               int x = 10, y = 20, z = 8;
 **         This will create three integer variables named "x", "y" and "z".
*/

public class MultipleVariables
{
    /**
     *&  ------ Example 1  ------
     *!      ----  Instead of writing:  -----
     *~         int x = 5;
     *~          int y = 6;
     *~             int z = 50;
     *^         System.out.println(x + y + z);
     * 
    */

    public static void main(String[] args) 
    {
        //~ declare multiple variables in a single line
        int num1 = 5, num2 = 36, num3 = 15;
        System.out.println("Example 1: \n SUM of num1, num2 and num3: " + (num1 + num2 + num3));

        // assign the same value to multiple variables
        int x , y , z;
        x = y = z = 70;
        System.out.println("\nExample 2:\n All values are set to 70");
        System.out.println("x : " + x + "\ny : " + y + "\nz : " + z);

        // end! 
    }
}