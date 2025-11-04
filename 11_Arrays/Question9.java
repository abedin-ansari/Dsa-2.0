public class Question9 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        printBiggestAndSmallest(nums);
    }
    public static void printBiggestAndSmallest(int[] arr){
        int big = arr[0];
        int small = arr[0];
        for(int i: arr){
            if (i>big) {
                big = i;
            }
            else if (i<small) {
                small = i;
            }
        }
        
        System.out.println("biggest elem is: " + big);
                System.out.println("Smallest elem is: " + small);

    }
}
