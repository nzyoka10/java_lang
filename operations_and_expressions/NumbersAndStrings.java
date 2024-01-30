public class NumbersAndStrings 
{
    /**
     * *     ********------  Adding Numbers and Strings  -------- ***********************
     * !     Java uses the + operator for both addition and concatenation
     * ~           That is:-
     * ~                 --> Numbers are added together and,
     * ~                 --> Strings are added together
     **        //    If you add two numbers, the result will be a number:
     * ~ --> int x=1, y= 2; int z=x+y;    //! z will be an integer, 3 
     */
    public static void main(String[] args)
    {
        //~ If you add two numbers, the result will be a number.
            int x = 10, y = 20;
            int z = x + y; 
            System.out.println(z);  // Output: integer
        
        //! if you add two strings, the result will be a string concatenation
            String x1 = "10", y1 = "20";
            String z1 = x1 + y1;
            System.out.println(z1);  // Output: String

        //& if you add a number and a string, the result will be a string concatenation
            String x2 = "KY100"; int y2 = 20;
            String z2 = x2 + y2;
            System.out.println(z2);

        /*
         * * ----------   Java special Characters -------
         * // strings must be written within quotes,
         * // Java :: will throw an error here..
         *!     String txt = "Hello Kenya, "located" in Africa!"
         * &      The above statement will give an error because of the use of ":" instead of
         *          the use of (\)  `backslash` escape character avoids above error
         *       \'  Single quote '
         *        \\' Double quote '
         *         \\  Backslash 
         *    
        */
            String txt = "We are the so-called \"Vikings\" from the north.";
            System.out.println(txt);

    }
}
