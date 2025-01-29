// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class num {
    
    public static void add(){
        // creates scanner object named input
        Scanner input = new Scanner(System.in);
        // Gets input from user as a string
        System.out.println("Enter numbers (No spaces):");
        String userInput = input.nextLine();
        String[] seperate = userInput.split(""); // turns string input into string array
        int count = 0;
        for (int i = 0; i < seperate.length; i++){
            count += Integer.parseInt(seperate[i]); // adds up all the digits
        }
        System.out.print(userInput + " combined equals: " + count); // output is put to terminal and formatted
        input.close();
    }
    public static void main(String[] args) {
        add();
    }
}

