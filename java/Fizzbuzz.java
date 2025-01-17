public class Fizzbuzz {
    public static void conditional(int number){
        if (number % 15 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0){
            System.out.println("Buzz");
        } else if (number % 5 == 0){
            System.out.println("Fizz");
        } else{
            System.out.println("NO NO NO NO NO");

        }
        
    } 
  public static void main(String args[]) {
    int num1=3;
    int num2=5;
    int num3=15;
    int num4 = 97;
    
    conditional(num1);

    conditional(num2);
    conditional(num3);
    conditional(num4);

    
  }
}
