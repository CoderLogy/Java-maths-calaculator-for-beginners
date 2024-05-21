import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();

        System.out.println("Enter an operation (+ (To Add) , - (To Subtract), * (To Mutiply) , / (To Divide) , # (To sqrt first number), $ (To sqrt second number):");
        char operation = sc.next().charAt(0);

        float subtraction = num1 - num2;
        float addition = num1 + num2;
        float multiplicaton = num1 * num2;
        float division = num1 / num2;
        float squareNum1 = num1 * num1;
        float squareNum2 = num2 * num2;

        switch(operation) {
            case '+':
                System.out.println("A added to B is " + addition);
                break;
            case '-':
                System.out.println("A subtracted by B is " + subtraction);
                break;
            case '*':
                System.out.println("A multiplied by B is " + multiplication);
                break;
            case '/':
                System.out.println("A divided by B is " + Division);
                break;
            case '#':
                System.out.println("Square of A is " + squareNum1);
                System.out.println("Square of B is " + squareNum2);
                System.out.println("A to the power of B is " + Math.pow(num1, num2));
                break;
            case '$':
                System.out.println("Square root of A is " + Math.sqrt(num1));
                System.out.println("Square root of B is " + Math.sqrt(num2));
                break;
            default:
                displayError();
                break;
        }

        sc.close();
    }

    public static void displayError() {
        throw new RuntimeException("Invalid operation. Please try again.");
    }
}


