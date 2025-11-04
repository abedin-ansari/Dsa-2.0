public class Question2 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        accessEvenIndex(nums);
    }
    public static void accessEvenIndex(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
