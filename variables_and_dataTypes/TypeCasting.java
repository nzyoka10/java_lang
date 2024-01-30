public class TypeCasting 
{
    public static void main(String[] args) 
    {
        // widening casting -->  done automatically when passing a smaller size type to a larger size type
        int myInt = 27;
        double myDouble = myInt; // automatic casting: int to double

        System.out.println("\nWidening Type Casting!");
        System.out.println(myInt); // Output: 9
        System.out.println(myDouble);  // Output: 27.0


        //~ Narrowing casting --> must be done manually by placing the type in parentheses in front of the value
        // narrowing casting --> must be done explicitly by the programmer
        System.out.println("\nNarrowing Type Casting!");

        byte myByte = 13;
        short myShort = (short) myByte; // explicit casting: byte to short

        double myDouble2 = 9.78d; //
        int myInt2 = (int) myDouble2; //~ manual casting: double to int

        System.out.println(myDouble2); //^ Output: 9.78
        System.out.println(myInt2); //^ Output: 9

        System.out.println(myByte); //^ Output: 13
        System.out.println(myShort); //^ Output: 13


    }
}
