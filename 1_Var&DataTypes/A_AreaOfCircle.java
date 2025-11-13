import java.util.Scanner;

public class A_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double area = 3.14 * rad * rad;
        System.out.println("area is: " + area);
    }
}
