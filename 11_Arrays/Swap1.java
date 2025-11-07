public class Swap1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {60, 70, 80, 90, 100};
        System.out.println("before swap: ");

        displayValues(a);
        displayValues(b);


        int[] temp = a;
        a=b;
        b=temp;

        System.out.println("After Swap: ");
        displayValues(a);
        displayValues(b);
    }
    public static void displayValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
