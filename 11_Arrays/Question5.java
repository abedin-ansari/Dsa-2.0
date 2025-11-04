public class Question1 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 415, 50, 60, 700};
        accessEvenIndex(nums);
    }
    public static void accessEvenIndex(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>= 100 && nums[i] <= 999){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
