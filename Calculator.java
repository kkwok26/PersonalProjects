import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
	
  	Scanner keyboard = new Scanner(System.in);
  	double firstNumber;
  	double secondNumber;
  	double answer = 0;
  	String operator;
  	String repeat;

 	do {
  		System.out.print("Enter the first number: ");
  		firstNumber = stdIn.nextDouble();
  		System.out.print("Enter an operator (+, -, *, /): ");
  		operator = keyboard.next();
  		System.out.print("Enter the second Number: ");
  		secondNumber = keyboard.nextDouble();

  		switch (operator.charAt(0)) {
   			case '+':
    			answer = firstNumber + secondNumber;
    			break;
   			case '-':
    			answer = firstNumber - secondNumber;
    			break;
   			case '*':
    			answer = firstNumber * secondNumber;
    			break;
   			case '/':
    			answer = firstNumber / secondNumber;
    			break;
   			default:
    			System.out.print("Error: Operator was not one of +, -, *, /.");
			}

  	System.out.println("Answer: " + answer);

 		} 
 	} 
}