public class C_LogicalOpr {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Logical AND (a > b && b < a): " + (a > b && b < a));
        System.out.println("Logical OR (a > b || b > a): " + (a > b || b > a));
        System.out.println("Logical NOT (!(a > b)): " + (!(a > b)));
    }
}
