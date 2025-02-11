import java.util.Scanner;

public class method {
    public static int sum(int num1, int num2, int num3){
        int sumNum = num1 + num2 + num3;
        return sumNum;
    }
    
    public static int maximum(int num1, int num2, int num3){
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    
    public static int minimum(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    
    public static double av(int sum){
        double average = sum / 3.0;
        return average;
    }
    
    public static void output(int num1, int num2, int num3, int sum, int max, int min, double average, boolean allPositive){
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static boolean isPositive(int num1, int num2, int num3){
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
    public static void processNumbers(int num1, int num2, int num3) {
        // Calculate sum
        int sumNum = sum(num1, num2, num3);
        // Find max
        int max = maximum(num1, num2, num3);
        // Find min
        int min = minimum(num1, num2, num3);
 
        // Calculate average
        double average = av(sumNum);
 
        // Check if all numbers are positive
        boolean allPositive = isPositive(num1, num2, num3);
        // Print results
        output(num1, num2, num3, sumNum, max, min, average, allPositive);
    }
    
    public static void getUserInput(){
            try(Scanner input = new Scanner(System.in)) {
                try{
                    System.out.println("Input three numbers and I'll output some stats  }:)\n");
                    System.out.print("Enter the first number: ");
                    int number1 = input.nextInt();
                    System.out.print("Enter the second number: ");
                    int number2 = input.nextInt();
                    System.out.print("Enter the third number: ");
                    int number3 = input.nextInt();
                    System.out.print("\n");
                    processNumbers(number1, number2, number3);
                } catch(Exception e){
                    System.out.println("\nOne of the inputs is false\nTry again...\n\n");
                    main(null);
                }
                System.out.println("\n\n");
                input.close();
            }

            
        }

    
    public static void main(String[] args) {
        while (true){
            System.out.println("-----------------------------------------");
            getUserInput();
        }

    }
}
