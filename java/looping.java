import java.util.Scanner;
class looping {
    // Main method that allows the user to choose between the various programs
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // This is the scanner used through the whole program
      boolean go = true;
      while (go){
          System.out.println("Enter the number of which program you wish to run:\n");
          System.out.println("1. Repeat Addition\n2. Guess the Number\n3. Validate Positive Number Input\n4. Skip Multiples of 3\n5. Exit\n");
          System.out.print("Input: ");
          int choice = input.nextInt();
          
          // Looks at the user input and runs the corresponding method or exits
          // The scanner object, input, is passed through to methods 1-3
          switch(choice){
              case 1 -> {
                  System.out.print("\n\n\n");
                  add(input);
              }
              case 2 -> {
                  System.out.print("\n\n\n");
                  guess(input);
              }
              case 3 ->  {
                  System.out.print("\n\n\n");
                  positiveInput(input);
              }
              case 4 ->  {
                  System.out.print("\n\n\n");
                  skipThree();
              }
              case 5 ->  {
                  go = false;
                  input.close(); // Closes scanner when the user exits the program
              }
          }
      }

    }
    
    // Generates two random numbers and makes the user input the answer
    public static void add(Scanner input){
        
        int ranNum1 =  (int) (Math.random() * 10);
        int ranNum2 =  (int) (Math.random() * 10);
        boolean correct;
         
         // Prints out that question and gets user input, looping if wrong
         do {
             System.out.print(ranNum1 + " + " + ranNum2 + " = ");
             int userNum = input.nextInt();
             if (userNum == (ranNum1 + ranNum2)){
                 System.out.println("That's correct!!!!\n\n");
                 correct = true;
             }
             else {
                 System.out.println("*Loud incorrect buzzer noise*\n\n");
                 correct = false;
             }
         } while (correct == false);
    }
    
    // Generates a random number and makes the user guess the value, giving hints to help
    public static void guess(Scanner input){
        
        int ranNum = (int) (Math.random() * 102); // * 102 because the maximum value will be 100.98, which truncates to 100 when cast to int
        boolean correct;
        System.out.println("Guess the random number between 0 and 100:\n\n");
        
        do {
            System.out.print("Enter your guess: ");
            int userGuess = input.nextInt();
            if (userGuess == ranNum){
                 System.out.println("That's correct!!!!\n\n");
                 correct = true;
             }
             else {
                 correct = false;
                 System.out.println("*Loud incorrect buzzer noise*\n\n");
                 String hint = (userGuess > ranNum) ? "Guess is too high" : "Guess is too low"; // Checks to see if userGuess is higher than ranNum and assigns the proper hint based on if it's true or false
                 System.out.println(hint);}
        } while (!(correct)); // continues while the guess is incorrect
        
    }
    
    // validates input so that the user input must be positive
    public static void positiveInput(Scanner input){
       
       int number;
       
       // loop that continues until the user inputs a number > 0
       do {
            System.out.print("Enter a positive number: ");
            number = input.nextInt();
            if (number < 0){
                System.out.println("Invalid input...");
            } else if (number == 0){
                System.out.println("You should terminate this process NOW!!!!");
            }
            System.out.print("\n");
       } while(number <= 0);
        System.out.print("Thank you!\n\n");
    }
    
    // Prints out 1-20 and skips every multiple of 3
    @SuppressWarnings("UnnecessaryContinue")
    public static void skipThree(){
         for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){ 
                continue;// Skips this iteration if it is a multiple of 3
            }else{
                System.out.println(i);
            }
       }
       System.out.println("\n");
    }
}
