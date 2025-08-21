import java.util.Scanner;

public class Parameters {
    public static int calcSum(int num1, int num2){ // Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers to sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcSum(a, b); // Argumets
        System.out.println("sum is: " + sum);
    }
}
