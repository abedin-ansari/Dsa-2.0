import java.util.Scanner;

public class SumOfn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print Sum:");
        int sum = 0;
        int i = 1;
        int n = sc.nextInt();

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("total sum of number: " + sum);
        sc.close();
    }
}
