public class Operators 
{
    /**
     * *    Operators : used to perform operations on variables and values
     *              + :  used to add two values
     *                  : + operator is often used to add together two values, 
     *~                  Eg:- , it can also be used to add together a variable and a value, 
     * ~                          or a variable and another variable:
     * &                              int sum1 = 100 + 50;        // 150 (100 + 50)
     * &                              int sum2 = sum1 + 250;      // 400 (150 + 250)
     * &                              int sum3 = sum2 + sum2;     // 800 (400 + 400)
     *  
     *  Java divides the operators into the following groups:
    **            Arithmetic operators ----> +, -, *, /, %, ++, --, 
    **            Assignment operators ---> =, +=, -=, *=, %=, /=, &=, |=, ^=, >>=, <<=
    **            Comparison operators ---> !=, <, >, <=, >=, ==
    **            Logical operators  --->  &&, ||, !
    **            Bitwise operators
            
            
     */

    public static void main(String[] args)
    {
        //* Arithmetic operations */
        int a = 4;
        int b = 8;
        int sum = a + b;
        int multiply = a * b;
        int division = sum / b;
        int modulus = a % b;
        int increment = ++sum;
        int decrement = sum--;

        System.out.println("Sum of a and b is: " + sum + ""); //~ Output: 12
        System.out.println(5 * 2); // Output: 10
        System.out.println(9 % 4); // Output: 1
        

      /**
       *  System.out.println("Multiply a and b: " + multiply + ""); //~ Output: 32
            System.out.println("Divide sum and b: " + division + ""); //~ Output: 1
            System.out.println("Modulus of a and b is: " + modulus + ""); //~ Output: 4
            System.out.println("Increment of sum: " + increment + ""); //~ Output: 13
            System.out.println("Decrement of sum: " + decrement + ""); //~ Output: 11
        **/
        //System.out.println("\n");

        //** Java assignment operators */
        // used to assign values to variables 
            int myNum = 3;
            System.out.println(myNum); // output: 3

        // addition assignment operator (+=), adds a value to a variable
            int myNum1 = 10;
            myNum1 += 5;
            System.out.println(myNum1); // Output: 15

        //~ -------------   Comparison Operators -----------------
            // used to compare two variables 
            int myNum2 = 10;
            int myNum3 = 7;
            System.out.println(myNum2 > myNum3); // Returns: TRUE , 10>7
        
        //^ --------- Logical Operators --------
            //*  also used to compare two variables 
                //~ Logical AND (&&) --> returns true if both statements are true
                //~ Logical OR (||)  --> returns true if one of the statement is true
                //~ Logical NOT (!) --> reverse the result, if true then false and if flase then true
        
        


        






        int x = -4;
        System.out.println(x>>1); // Output: -2

        int y = 7;
        System.out.println(y>>1); // output: 3

    }
}
