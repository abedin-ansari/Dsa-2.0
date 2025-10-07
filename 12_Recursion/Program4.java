public class Program4 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        test(1);
    }
    public static void test(int n){
        if(n <= 10){
            test(n + 1);
            System.out.println(n);
        }
    }
}
