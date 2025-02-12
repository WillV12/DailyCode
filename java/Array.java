import java.util.Scanner;
public class Array {
    public static void task1(){
        int[] intArray;
        intArray = new int[5];
        System.out.println("Task 1: Declare an Array\nintArray:");
        System.out.print("\tIndex " + 0 + ": " + intArray[0]);
        System.out.print(" \tIndex " + 1 + ": " + intArray[1]);
        System.out.print(" \tIndex " + 2 + ": " + intArray[3]);
        System.out.print(" \tIndex " + 3 + ": " + intArray[3]);
        System.out.print(" \tIndex " + 4 + ": " + intArray[4]);
    }

    public static void task2(){
        int[] intArray;
        intArray = new int[5];
        intArray[0] = 21;
        intArray[1] = 12;
        intArray[2] = 22;
        intArray[3] = 11;
        intArray[4] = 2;
        System.out.println("Task 2: Declare an Array and fill the values in multiple lines\nintArray:");
        System.out.print("\tIndex " + 0 + ": " + intArray[0]);
        System.out.print("\tIndex " + 1 + ": " + intArray[1]);
        System.out.print("\tIndex " + 2 + ": " + intArray[3]);
        System.out.print("\tIndex " + 3 + ": " + intArray[3]);
        System.out.print("\tIndex " + 4 + ": " + intArray[4]);
    }

    public static void task3(){
        int[] intArray = {21, 12, 22, 11, 2};
        System.out.println("Task 3: Declare an Array and fill the values in one line\nintArray:");
        System.out.print("\tIndex " + 0 + ": " + intArray[0]);
        System.out.print(" \tIndex " + 1 + ": " + intArray[1]);
        System.out.print(" \tIndex " + 2 + ": " + intArray[3]);
        System.out.print(" \tIndex " + 3 + ": " + intArray[3]);
        System.out.print(" \tIndex " + 4 + ": " + intArray[4]);
    }

    public static void task4(){
        int[] intArray;
        intArray = new int[5];

        System.out.println("Task 4: Declare an Array and fill the values using a for loop\nintArray:");
        for (int i = 0; i < 5; i++){
            intArray[i] = (i+1) * 3; 
            System.out.print("\tIndex " + i + ": " + intArray[i] + " ");
        }

    }

    public static void task5(){
        char[] charArray;
        charArray = new char[5];

        charArray[0] = 'A';
        char newValue = 'A';
        System.out.println("Task 5: Declare an Array and fill the values using a for loop, char edition\ncharArray:");
        for (int i = 0; i < 5; i++){
            charArray[i] = newValue;
            System.out.print("\tIndex " + i + ": " + charArray[i] + " ");
            newValue += (char) 2;

        }

    }

    public static void task6(Scanner input){
        System.out.print("What is the size of the array?: ");
        int arrayLength = input.nextInt();
        int[] ranArray = new int[arrayLength];

        System.out.println("Task 6: User-Defined Array with Random Values\nranArray:");
        for (int i = 0; i < arrayLength; i++){
            int ranNum = (int) (1 + Math.random() * 100);
            ranArray[i] = ranNum;
            System.out.print("\tIndex " + i + ": " + ranArray[i] + " ");

            
        }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("\n\n\ncode day!!!!\nEnter 7 to exit: ");
            int choice = input.nextInt();

            switch (choice){
                case 1 ->  {
                    System.out.print("\n");
                    task1();
                }
                case 2 ->  {
                    System.out.print("\n");
                    task2();
                }
                case 3 ->  {
                    System.out.print("\n");
                    task3();
                }
                case 4 ->  {
                    System.out.print("\n");
                    task4();
                }
                case 5 ->  {
                    System.out.print("\n");
                    task5();
                }
                case 6 ->  {
                    System.out.print("\n");
                    task6(input);
                }
                case 7 -> {
                    System.out.print("\n");
                    input.close();
                    System.exit(0);
                }
            }
        }

    }
}
