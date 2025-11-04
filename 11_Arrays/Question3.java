// Question: What is the output of this program that processes array elements in reverse order?

public class Question3 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        accessFromEnd(nums);
    }
    public static void accessFromEnd(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
                System.out.println(arr[i] + " ");
        }
    }
}