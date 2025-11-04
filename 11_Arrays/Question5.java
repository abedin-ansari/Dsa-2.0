// Question: What is the output of this program that finds three-digit numbers in an array?

public class Question5 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 415, 50, 60, 700};
        findThreeDigitNumbers(nums);
    }
    public static void findThreeDigitNumbers(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>= 100 && arr[i] <= 999){  // Fixed: changed nums[i] to arr[i]
                System.out.println(arr[i] + " ");
            }
        }
    }
}