import java.util.Scanner;

public class A_SumOfnNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number n:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.err.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
