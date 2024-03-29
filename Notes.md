# ```JAVA Programming Notes```
```Java Syntax, rules of naming variables, functions, operators, expressions, varables, datatypes etc...```
- > **Main.java :** ***(program name)***
    - ****```Basic Java Program below```****
```
public class Main 
{
    # program name muste be in upper case
    # class name and program name MUST have same names

        public static void main(String[] args) 
        {
            System.out.println("Hello World");
        }
}
````

- A class MUST always start with and UPPERCASE first letter.
    - Eg;- Main.java

- ```NOTE:``` Java is case sensitive:
    ```
        "MyClass" 
            and
        "myclass" ---> has different meaning.
    ```
- The name of the java file must match the class name.
#
###  ```The main Method```
- > public static void main(String[] args): 
    - This method is where the program starts executing from when you run a Java application. 
    - It's called by the JVM (Java Virtual Machine).
    - String[] args : An array of strings that contains the command line arguments passed to the program. 
    - If no arguments are provided, it will be an empty array.
- > Main() method is required & used in every Java program.
- > **System.out.println()**
    - Used to display any output on console.
        -  **Example:**
            -  System.out.println("Hello World");

- > Java Output / Print
    Print Text
    - println() method is used to output values 
        - Example
          - System.out.println("Hello World!");
          - System.out.println("I am learning Java.");
          - System.out.println("It is awesome!");
  - Double Quotes
    - ```When you are working with text, it must be wrapped inside double quotations marks("").```
    - ```If you forget the double quotes, an error occurs:```
        - System.out.println("This sentence will work!"); ```// correct```
        - System.out.println(This sentence will produce an error); ```// error occurs : NO quotation marks!```

### ```The Print() Method```
- There is also a print() method, which is similar to println().
    - The only difference is that it does not insert a new line at the  end of the output:
    - >Example
        - System.out.print("Hello World! ");
        - System.out.print("I will print on the same line.");

#### ```Java Comments```
- Comments can be used to explain Java code, and to make it more readable.
- It can also be used to prevent execution when testing alternative code.
  1. ````Single Line Comments````  //.
        - Example:
          - ```// This is a single-line comment.```
            - int x = 5;   ```// Another single-line comment.```

   2. ```Multi-Line Comments``` /* some comment here. */.
        - Example:
          - ```/**```
        ```This is a multi-line comment.```
        ``` You can write as many lines as you want.```
        ``` Even without adding anything between them.```
        ```*/```
            
### ```Java identifiers ```
- > All java variables must be identified with unique names,
      the unique names are called identifiers.
- They can be short like; ***i, j, x*** or **more** 
       descriptive names like; age, sum, price etc.
- **```NOTE:```** It's recommended to use descriptive names in order to create  understandable code and maintainable code.

### ```Java Data Types ```
- A variable in Java must be a specified data type:
    - > Example
      - int myNum = 5;               // Integer (whole number)
      - float myFloatNum = 5.99f;    // Floating point number
      - char myLetter = 'D';         // Character
      - boolean myBool = true;       // Boolean
      - String myText = "Hello";     // String

- > Data types are divided into two groups:
  - Primitive data types - includes byte, short, int, long, float, double, boolean and char
  - Non-primitive data types - such as String, Arrays and Classes 

- ```Primitive Data Types```
  - A primitive data type specifies the size and type of variable values, and it has no additional methods.
  - There are eight primitive data types in Java:
    - byte - an 8 bit signed integer (-128 to +127)
    - short - a 16 bit signed integer (-32768 to +32767)
    - int - a 16 bit signed integer
    - long - a 16 bit signed integer
    - float - a 16 bit signed integer
    - double - a 16 bit signed integer
    - char - a single character (Unicode)

 - > ```Data      Type	Size	   Description```
   - byte	   1 byte	         Stores whole numbers from -128 to 127
   - short	   2 bytes	        Stores whole numbers from -32,768 to 32,767
   - int	         4 bytes	      Stores whole numbers from -2,147,483,648 to 2,147,483,647
   - long	   8 bytes	        Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   - float	    4 bytes	         Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
   - double	 8 bytes	      Stores fractional numbers. Sufficient for storing 15 decimal digits
   - boolean	1 bit	           Stores true or false values
   - char	    2 bytes	        Stores a single character/letter or ASCII values

### ```Java Type casting```
- The process of converting one data type to another is called type casting. 
- In Java, you can use the following code to convert one data type to another
  - ```Example:```
    - int x = 50;
    - float y = (float)x;
  - There are 2 types of casting in Java;-
    1. ```Widening casting (automatically)``` --> converting a smaller type to a larger type size.
       - byte-> short-> char-> int-> long-> float-> double
    2. ```Narrowing Casting (manually)``` --> converting a larger type to a smaller type size
       - double -> float -> int -> long -> char -> short -> byte

    