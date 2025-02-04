// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
     // word word word word(Word[] word)    {
    // Create a Scanner object for user input
    public static void main(String[] args) {
        
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        double number = 1.0;            
        System.out.println("Looping from 1.0 to 5.0 with rounding methods");
        while (number <= 5.0){
            output(number); // look at the method at the bottom, line: 92
            number += .5;
        }
        
        Scanner input =  new Scanner(System.in);
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.println(" ");
        System.out.print("Please input a decimal: ");
        double decimal = input.nextDouble();
        output(decimal);
        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.println(" ");
        System.out.print("Please input an integer: ");
        int integer = input.nextInt();
        input.nextLine();
        System.out.print("Please input string: ");
        String word = input.nextLine(); 
        System.out.println("You entered the integer: " + integer);
        System.out.println("You entered the string: " + word);
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        System.out.println(" ");
        double newDouble = integer;
        System.out.println("Implicit cast: Inputed integer --> double: " + newDouble);
        decimal = (int) decimal;
        System.out.println("Explicit cast: Inputed decimal --> int: " + decimal);
        char newChar = (char) integer;
        System.out.println("Casting int --> char: " + newChar);
        
        
        
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.println(" ");
        System.out.print("Enter a character: ");
        char userChar = input.next().charAt(0);
        int charNum = userChar;
        System.out.println("The ASCII value of " + userChar + " is: " + charNum);
        
        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        System.out.println(" ");
        String litS1 = "I'm a string!!!";
        String litS2 = "I'm a string!!!";
        String newString = new String("I'm a string!!!");
        System.out.println("S1 vs. S2: " + (litS1 == litS2));
        System.out.println("S1 vs. New String: " + (litS1 == newString));
        System.out.println("S1.equals(newString): " + litS1.equals(newString));
        
        
        // Close the Scanner object
        input.close();
    //}
    }
    
    // I didn't want to type this out again, so I made it into a method that outputs the rounding of the parameter number
    public static void output(double number){
        System.out.print("Number: " + number);
            System.out.print(" Math.ceil(): " + Math.ceil(number));
            System.out.print(" Math.floor(): " + Math.floor(number));
            System.out.print(" Math.rint(): " + Math.rint(number));
            System.out.print(" Math.round(): " + Math.round(number) + "\n");
    }
}
