import java.util.Scanner;

public class D_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %):");

        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': 
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-': 
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                System.out.println("Result: " + (num1 % num2));
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
