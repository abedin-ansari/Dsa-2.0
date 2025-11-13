import java.util.Scanner;

public class C_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        // int b = a; // error: incompatible types: possible lossy conversion from float to int
        int b = (int) a; // explicit type casting
        System.out.println(b);
    }
}
