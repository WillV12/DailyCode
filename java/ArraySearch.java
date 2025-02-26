import java.util.Arrays;
import java.util.Scanner;
public class ArraySearch {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize;
        int target;
        
        // TODO: Get array size from user using Scanner
        // TODO: Validate input to ensure a positive integer for array size
        do {
            System.out.print("\nPlease enter the size of the array: ");
            arraySize = input.nextInt();
        }while(arraySize <= 0);

    
        // TODO: Create an array of the specified size and fill with random numbers
        int[] pile = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            pile[i] = (int)(1 + (Math.random()*1000));
        }

        // TODO: Get target number from user using Scanner
        // TODO: Validate input to ensure a positive integer for the target number if found, -1 if not
        do { 
            System.out.print("\nPlease enter the target value: ");
            target = input.nextInt();
        } while (target <= 0);

        input.close();

        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();

        // TODO: Implement linear search to find the index of the target number
        int linearResult = -1;
        for (int i = 0; i < arraySize; i++){
            if (pile[i] == target){
                linearResult = i;
                break;
            }
        }

        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.\n");

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...\n");
        // TODO: Sort the array as specified above
        Arrays.sort(pile);

        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        // TODO: Implement binary search to find the index of the target number if found, -1 if not
        int binaryResult = Arrays.binarySearch(pile, target);

        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.\n");

        // TODO: Display the result of the binary search (index or not found)
        switch (linearResult){
            case -1 ->  {System.out.println("Linear Search Result; Value at index: No index found"); }
            default -> {System.out.println("Linear Search Result; Value at index: " + linearResult);}
        }
        if (linearResult < 0){
            System.out.println("Binary Search Result; Value at index: No index found"); 
        }else{
           System.out.println("Binary Search Result; Value at index: " + binaryResult);}
        
        
    
        // TODO: Display results specified in Display Output section
        System.out.println("\n\n");
        System.out.println("Time for Linear Search: " + (linearEndTime - linearStartTime) + " nanoseconds");
        System.out.println("Time for Binary Seach: " + (binaryEndTime - binaryStartTime) + " nanoseconds");
    }
}
