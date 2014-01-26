import java.util.Scanner;

public class CollatzConjecture {

        public static void main( String[] args ) {
                
                int steps = 0;
                
                System.out.print("Enter a number: ");
                Scanner keyboard = new Scanner(System.in);
                
                int input = keyboard.nextInt();
                int x = input;
                
                while(x > 1) {
                    if (x % 2 == 0) {
                        x /= 2;
                    } else 
                    	x = (x * 3) + 1;
                        steps++;        
                }            
                System.out.println("Using the Collatz conjecture on " + input + ", it takes " + steps + " to reach 1.");
        }
}