public class ProductOfAandB_3 {
    public static int multiple(int x, int y){
        int mult = x*y;
        return mult;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int multiple = multiple(a, b);
        System.out.println("Multiple of A and B are: " + multiple);
    }
}