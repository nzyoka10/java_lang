public class Boolean 
{
    public static void main(String[] args)
    {
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun); // true
        System.out.println(isFishTasty); // false

        //~ Boolean Expression
            // returns a boolean value: true or false
            int x = 10, y = 9;
            System.out.println(x > y);
            System.out.println(x < y);
            System.out.println(y == 9);
        
        //^ Example:-
        int myAge = 27;
        int votingAge = 18;
            if (myAge >= votingAge)
            {
                System.out.println("Allowed to Vote!");
            }
            else
            {
                System.out.println("Not Allowed to Vote!");
            }
       // System.out.println(myAge >= votingAge); // allowed to vote

    }
}
