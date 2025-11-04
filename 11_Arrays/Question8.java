public class Question8 {
    public static void main(String[] args) {
        int[] nums = {10, 21, 31, 41, 50, 60, 70};
        printAndCount(nums);
    }
    public static void printAndCount(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
            double avg = sum/arr.length;
            System.out.println("Bigger elems then avg: ");
            int count = 0;
            
        for(int x:arr){
            if(x>avg){
                System.out.println(x + " ");
                count++;
            }
        }
        System.out.println("\nTotal Such Nums are: " + count);
    }
}
