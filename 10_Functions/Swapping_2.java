public class Swapping_2 {
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Value of a is: " + x);
        System.out.println("Value of b is: " + y);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
    }
}
