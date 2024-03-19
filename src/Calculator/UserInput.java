package Calculator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {

double a;
char continuation;
char operator;
double b;

    public void inputNumbers() {
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.println("Press e to exit the calculator or any other letter to continue: ");
            continuation = userInput.next().charAt(0);
            if (continuation == 'e') {
                System.out.println("Exiting the calculator");
                System.exit(0);}
            System.out.println("Enter the first number: ");
            a = userInput.nextDouble();
            System.out.println("Enter the operator (+ , - , / , * ): ");
            operator = userInput.next().charAt(0);
            System.out.println("Enter the second number: ");
            b = userInput.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input. Please try again!");
            userInput.nextLine();
            inputNumbers();
        }

    }



}
