public class Program_1 {

    public static void test(){
        System.out.println("This is a test method");
        test();
    }
    public static void main(String[] args) {
        System.out.println("Main Starts");
        test();
        System.out.println("Main Ends");

    }
}
