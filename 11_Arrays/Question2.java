// Question: What is the output of this program that processes even numbers from an array?

public class Question2 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        printEvenNumbers(nums);
    }
    public static void printEvenNumbers(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}