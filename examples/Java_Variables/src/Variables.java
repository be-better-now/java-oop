/*
In Java, there are different types of variables, for example:
- String: stores TEXT, as "Hello". String value are surrounded by double quotes ""
- int: stores integers (whole numbers), without decimals, such as 123 or -123
- float: stores floating point numbers, with decimals, such as 19,99 or -19,99
- char: stores single characters, such as 'a' or 'B'. Char values are surrounded
by single quotes
- boolean: stores values with two states - true or false
 */

/**
 *
 * @author huudu
 */
public class Variables {
    public static void main(String[] args) {
        
    
    //1. Declaring (Creating) Variables:
    //Syntax: type variablelName = value;
    String name = "Duy";
        System.out.println("My name: " + name);
    
    int old = 21;
        System.out.println("My old: " + old);
    
    /*You can alse declare a variable without assigning the value,
    and assign the value later.
     *Note that, if you assign a new value to an existing variable, it will 
    overwrite the previous value*/
    String myClass = "SE1805";
    myClass = "SE1826";
        System.out.println("My class: " + myClass);
    //2. Final Variable
    /*If you dont want to other or yourself to overwrite existing values,
      use the "final" keyword, this will declare the variable as "final" or "constant",
      which means unchangeable and read-only*/
    final String studentId = "SE183964";
        System.out.println("My student ID: " + studentId);
        
    
    //3. Other types:
    System.out.println("---------------------------");
    int myNum = 3;
    float myFloatNum = 5.99f;
    double myDoubleNum = 2024.5;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";   
        System.out.println("My number: " + myNum + "\n"
                         + "My float number: " + myFloatNum + "\n"
                         + "My dounle number: " + myDoubleNum + "\n"
                         + "My letter: " + myLetter + "\n"
                         + "My boolean: "+ myBool + "\n"
                         + "My text: " + myText);
    }  
}
