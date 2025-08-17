import java.util.Scanner;

public class BreakStmnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                break;
            }

            System.out.println("You Entered: " + n);
        } while(true);
    }
}
