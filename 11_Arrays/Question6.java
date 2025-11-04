// Question: What is the output of this program that calculates the sum of all elements in an array?

public class Question6 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        int sum = getSum(nums);
        System.out.println(sum);
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}