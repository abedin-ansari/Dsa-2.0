import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to print: ");
        int counter = 1;
        int n = sc.nextInt();

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }


    // public static void main(String[] args) {
    //     int count = 1;

    //     while(count <= 100){
    //         System.out.println(count);
    //         count++;
    //     }
    // }
}