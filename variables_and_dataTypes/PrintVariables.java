/**
 * * --------  Java Print Variables -----
 *^      Display variable
 *~ The println() method is often used to display variables
 *~ to combine both text and variable, use the + operator
 *
*/

public class PrintVariables
{
    public static void main(String[] args) 
    {
        String name = "Eric Nzyoka";
        System.out.println("Hello " +name);

        //& You can also use the + character to add a variable to another variable
        String firstName = "Ethan";
        String lastName = "Mutua";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        //~ For numeric values, + character is used as a mathematical operator
        int num1 = 5;
        int num2 = 7;
        System.out.println(num1 + num2);


        int sum = num1 + num2;
       System.out.println("The sum of "+num1+" and "+num2+" is "+sum+"." );
        

    }

}