public class Question1 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        getAvg(nums);
    }
    public static void getAvg(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i/2 == 0){
                System.out.println(arr[i] + " ");
            }
        }
    }
}

// INCMp