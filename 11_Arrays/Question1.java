// Question: What is the output of this program that processes array elements at even indices?

public class Question1 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        accessEvenIndex(nums);
    }
    public static void accessEvenIndex(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}