import java.util.Scanner;
class Main {
    public static void factorial(String[] args) {
        // creates new scanner object
        Scanner input = new Scanner(System.in);
        
        // retrieves input
        System.out.println("Please input a number: ");
        int num = input.nextInt();
        
        // if the number is 0 the code won't run
        if (num == 0){
            System.out.println("0 can't have a factorial");
        }
        else {
            long output = calc(num);
            System.out.println("The factorial of " + num + " is " + output + ".");
        }

        input.close();
        
    }
    
    public static long calc(int number){
        long factorial = 1;
        for (int i = 0; i < number; i++ ){
            factorial *= number - i;
        }
        return factorial;
    }
}